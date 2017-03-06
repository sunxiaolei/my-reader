package sunxl8.my_reader.ui.dbmoment.main;

import com.trello.rxlifecycle.android.ActivityEvent;

import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.BasePresenter;
import sunxl8.my_reader.net.dbmoment.DbMomentRequest;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DbMomentPresenter extends BasePresenter<DbMomentContract.View> implements DbMomentContract.Presenter {

    protected DbMomentPresenter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public void getColumns() {
        DbMomentRequest.getColumns()
                .compose(mActivity.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(dto -> {
                    mView.setColumns(dto);
                }, throwable -> {
                    mView.error(throwable.getMessage());
                });
    }
}
