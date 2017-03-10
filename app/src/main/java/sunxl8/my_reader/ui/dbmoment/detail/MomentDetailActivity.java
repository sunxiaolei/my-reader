package sunxl8.my_reader.ui.dbmoment.detail;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.webkit.WebView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.jakewharton.rxbinding.view.RxView;
import com.trello.rxlifecycle.android.ActivityEvent;

import java.io.File;

import butterknife.BindView;
import rx.functions.Action1;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.net.doubanmoment.dto.PostsBean;
import sunxl8.myutils.FileUtils;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MomentDetailActivity extends BaseActivity {

    @BindView(R.id.web_moment_detail)
    WebView mWebView;
    @BindView(R.id.iv_moment_detail)
    SubsamplingScaleImageView mView;

    private PostsBean bean;
    private File mFile;

    private boolean isWeb = true;

    @Override
    protected IPresenter createPresenter() {
        return null;
    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_moment_detail;
    }

    @Override
    protected void initData() {
        bean = (PostsBean) getIntent().getSerializableExtra("bean");

        mWebView.loadUrl(bean.getUrl());
    }

    private void showMenuDialog() {
        new AlertDialog.Builder(this)
                .setItems(new String[]{"保存到本地", "取消"}, (dialog, which) -> {
                    if (which == 0) {
                        saveImage();
                    }
                })
                .show();
    }

    @Override
    protected void initView() {
        toolbarIcon.setVisibility(View.VISIBLE);
        toolbarIcon.setImageResource(R.drawable.ic_change);
        RxView.clicks(toolbarIcon)
                .compose(this.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(aVoid -> {
                    change();
                });
        mView.setMinimumScaleType(SubsamplingScaleImageView.SCALE_TYPE_CUSTOM);
        mView.setMinScale(1.0F);
        mView.setMaxScale(5.0F);
        RxView.longClicks(mView)
                .compose(this.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(aVoid -> {
                    showMenuDialog();
                });
    }

    private void change() {
        if (isWeb) {
            mWebView.setVisibility(View.GONE);
            mView.setVisibility(View.VISIBLE);
            showLoading();
            Glide.with(this).load(bean.getShare_pic_url()).downloadOnly(new SimpleTarget<File>() {

                @Override
                public void onResourceReady(File resource, GlideAnimation<? super File> glideAnimation) {
                    dismissDialog();
                    mFile = resource;
                    mView.setImage(ImageSource.uri(Uri.fromFile(resource)), new ImageViewState(2.5F, new PointF(0, 0), 0));
                }

            });
        } else {
            mWebView.setVisibility(View.VISIBLE);
            mView.setVisibility(View.GONE);
        }
        isWeb = !isWeb;
    }

    @Override
    public void error(String msg) {

    }

    public static void startMomentDetailActivity(Context context, PostsBean bean) {
        Intent intent = new Intent(context, MomentDetailActivity.class);
        intent.putExtra("bean", bean);
        context.startActivity(intent);
    }

    public void saveImage() {
        File file = new File(Environment.getExternalStorageDirectory(), "/MyReader/" + System.currentTimeMillis() + ".jpg");
        file.getParentFile().mkdirs();
        boolean saveRes = FileUtils.copyFile(mFile, file);
        if (saveRes) {
            showToast("保存成功");
        } else {
            showToast("保存失败");
        }
    }
}
