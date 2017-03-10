package sunxl8.my_reader.ui.maoyan.detail;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.net.maoyanmovie.dto.MovieDetailDto;
import sunxl8.my_reader.net.maoyanmovie.dto.MovieDetailModelBean;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class MovieDetailActivity extends BaseActivity<MovieDetailPresenter> implements MovieDetailContract.View {

    @BindView(R.id.iv_maoyanmovie_detail_poster)
    SimpleDraweeView ivPoster;
    @BindView(R.id.tv_maoyanmovie_detail_dra)
    TextView tvDra;
    @BindView(R.id.tv_maoyanmovie_detail_name)
    TextView tvName;
    @BindView(R.id.tv_maoyanmovie_detail_dir)
    TextView tvDir;
    @BindView(R.id.tv_maoyanmovie_detail_actor)
    TextView tvActor;

    @Override
    protected MovieDetailPresenter createPresenter() {
        return new MovieDetailPresenter(this);
    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_maoyanmovie_detail;
    }

    @Override
    protected void initData() {
        showLoading();
        int id = getIntent().getIntExtra("id", 0);
        mPresenter.getMovieDetail(id);
    }

    @Override
    protected void initView() {

    }

    @Override
    public void error(String msg) {
        dismissDialog();
        showToast(msg);
    }

    public static void startMovieDetailActivity(Context context, int id) {
        Intent intent = new Intent(context, MovieDetailActivity.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }

    @Override
    public void setMovieDetail(MovieDetailDto dto) {
        dismissDialog();
        MovieDetailModelBean detailBean = dto.getData().getMovieDetailModel();
        ivPoster.setImageURI(detailBean.getImg());
        tvDra.setText(Html.fromHtml(dto.getData().getMovieDetailModel().getDra()));
        tvName.setText(detailBean.getNm());
        tvDir.setText("导演：" + detailBean.getDir());
        String[] actors = detailBean.getStar().split(" ");
        tvActor.setText("主演：" + actors[0] + " " + actors[1] + " " + actors[2]);
    }
}
