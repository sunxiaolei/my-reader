package sunxl8.my_reader.ui.maoyan.detail;

import com.trello.rxlifecycle.android.ActivityEvent;

import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.BasePresenter;
import sunxl8.my_reader.net.maoyanmovie.MaoyanMovieRequest;

/**
 * Created by sunxl8 on 2017/3/7.
 */

public class MovieDetailPresenter extends BasePresenter<MovieDetailContract.View> implements MovieDetailContract.Presenter {

    protected MovieDetailPresenter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public void getMovieDetail(int id) {
        MaoyanMovieRequest.getMovieDetail(id)
                .compose(mActivity.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(dto -> {
                    mView.setMovieDetail(dto);
                }, throwable -> {
                    mView.error(throwable.getMessage());
                });
    }
}
