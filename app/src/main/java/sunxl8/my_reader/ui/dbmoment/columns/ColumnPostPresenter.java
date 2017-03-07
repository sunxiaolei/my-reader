package sunxl8.my_reader.ui.dbmoment.columns;

import com.trello.rxlifecycle.android.ActivityEvent;

import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.BasePresenter;
import sunxl8.my_reader.net.doubanmoment.DoubanMomentRequest;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnPostPresenter extends BasePresenter<ColumnPostContract.View> implements ColumnPostContract.Presenter {

    protected ColumnPostPresenter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public void getColumnPost(int id) {
        DoubanMomentRequest.getColumnPost(id, 10)
                .compose(mActivity.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(dto -> {
                    mView.setColumnPost(dto);
                }, throwable -> {
                    mView.error(throwable.getMessage());
                });
    }
}
