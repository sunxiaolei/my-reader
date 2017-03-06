package sunxl8.my_reader.ui.main.dbmoment;

import com.trello.rxlifecycle.android.ActivityEvent;

import rx.functions.Action1;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.BasePresenter;
import sunxl8.my_reader.net.dbmoment.DbMomentRequest;
import sunxl8.my_reader.net.dbmoment.dto.ColumnsDto;

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
