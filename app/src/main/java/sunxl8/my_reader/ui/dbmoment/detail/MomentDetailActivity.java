package sunxl8.my_reader.ui.dbmoment.detail;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Environment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.jakewharton.rxbinding.view.RxView;
import com.trello.rxlifecycle.android.ActivityEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.net.doubanmoment.dto.PostsBean;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MomentDetailActivity extends BaseActivity {

    @BindView(R.id.iv_test)
    SubsamplingScaleImageView mView;

    private PostsBean bean;
    private File mFile;

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

        mView.setMinimumScaleType(SubsamplingScaleImageView.SCALE_TYPE_CUSTOM);
        mView.setMinScale(1.0F);
        mView.setMaxScale(5.0F);

        showLoading();
        Glide.with(this).load(bean.getShare_pic_url()).downloadOnly(new SimpleTarget<File>() {

            @Override
            public void onResourceReady(File resource, GlideAnimation<? super File> glideAnimation) {
                dismissDialog();
                mFile = resource;
                mView.setImage(ImageSource.uri(Uri.fromFile(resource)), new ImageViewState(2.5F, new PointF(0, 0), 0));
            }

        });

        RxView.longClicks(mView)
                .compose(this.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(aVoid -> {
                    showMenuDialog();
                });
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
        try {
            FileOutputStream fos = new FileOutputStream(file);
            FileInputStream fis = new FileInputStream(mFile);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buf)) > 0) {
                fos.write(buf, 0, bytesRead);
            }
            fis.close();
            fos.close();
            showToast("保存成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
