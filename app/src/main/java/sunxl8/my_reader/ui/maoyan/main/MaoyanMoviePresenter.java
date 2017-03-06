package sunxl8.my_reader.ui.maoyan.main;

import com.trello.rxlifecycle.android.ActivityEvent;

import java.util.Map;

import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.BasePresenter;
import sunxl8.my_reader.net.maoyanmovie.MaoyanMovieRequest;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MaoyanMoviePresenter extends BasePresenter<MaoyanMovieContract.View> implements MaoyanMovieContract.Presenter {

    protected MaoyanMoviePresenter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public void getMainList(Map<String, String> params) {
        MaoyanMovieRequest.getMainList(params)
                .compose(mActivity.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(dto -> {
                    mView.setMainList(dto);
                }, throwable -> {
                    mView.error(throwable.getMessage());
                });
    }
}
