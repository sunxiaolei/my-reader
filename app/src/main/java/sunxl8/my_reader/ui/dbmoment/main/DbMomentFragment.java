package sunxl8.my_reader.ui.dbmoment.main;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import rx.Observable;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseFragment;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnBean;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DbMomentFragment extends BaseFragment<DbMomentPresenter> implements DbMomentContract.View {

    @BindView(R.id.rv_dbmoment)
    RecyclerView rvColumns;

    private DbMomentAdapter mAdapter;

    @Override
    protected DbMomentPresenter createPresenter() {
        return new DbMomentPresenter(mActivity);
    }

    @Override
    protected int setContentViewId() {
        return R.layout.fragment_moment;
    }

    @Override
    protected void initView() {
        rvColumns.setLayoutManager(new LinearLayoutManager(mActivity));
    }

    @Override
    protected void initData() {
        if (isVisible) {
            mActivity.showLoading();
        }
        mPresenter.getColumns();
    }

    @Override
    public void setColumns(ColumnsDto columns) {
        mActivity.dismissDialog();
        List<ColumnBean> list = columns.getColumns();
        mAdapter = new DbMomentAdapter(this, list);
        Observable.from(list)
                .subscribe(bean -> {
                    rvColumns.setAdapter(mAdapter);
                });
    }

    @Override
    public void error(String msg) {
        mActivity.dismissDialog();
        mActivity.showToast(msg);
    }
}
