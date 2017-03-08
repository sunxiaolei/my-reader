package sunxl8.my_reader.ui.maoyan.detail;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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
    ImageView ivPoster;
    @BindView(R.id.tv_maoyanmovie_detail_dra)
    TextView tvDra;

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
        Glide.with(this).load(detailBean.getImg()).into(ivPoster);
        tvDra.setText(Html.fromHtml(dto.getData().getMovieDetailModel().getDra()));
    }
}
