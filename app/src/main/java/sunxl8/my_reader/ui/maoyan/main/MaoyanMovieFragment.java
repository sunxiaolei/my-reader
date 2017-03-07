package sunxl8.my_reader.ui.maoyan.main;

import android.support.v7.widget.LinearLayoutManager;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseFragment;
import sunxl8.my_reader.net.maoyanmovie.dto.MainListDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MaoyanMovieFragment extends BaseFragment<MaoyanMoviePresenter> implements MaoyanMovieContract.View {

    @BindView(R.id.xrv_maoyanmovie_main)
    XRecyclerView xrvMain;

    private MaoyanMovieAdapter mAdapter;

    @Override
    protected MaoyanMoviePresenter createPresenter() {
        return new MaoyanMoviePresenter(mActivity);
    }

    @Override
    protected int setContentViewId() {
        return R.layout.fragment_maoyanmovie;
    }

    @Override
    protected void initData() {
        if (isVisible) {
            mActivity.showLoading();
        }
        Map<String, String> params = new HashMap<>();
        params.put("type", "hot");
        params.put("offset", "0");
        params.put("limit", "10");
        mPresenter.getMainList(params);
    }

    @Override
    protected void initView() {
        xrvMain.setLayoutManager(new LinearLayoutManager(mActivity));
        xrvMain.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                Map<String, String> params = new HashMap<>();
                params.put("type", "hot");
                params.put("offset", "0");
                params.put("limit", "10");
                mPresenter.getMainList(params);
            }

            @Override
            public void onLoadMore() {

            }
        });
    }

    @Override
    public void error(String msg) {
        mActivity.dismissDialog();
        if (isVisible) {
            mActivity.showToast(msg);
        }
    }

    @Override
    public void setMainList(MainListDto dto) {
        mActivity.dismissDialog();
        xrvMain.refreshComplete();
        mAdapter = new MaoyanMovieAdapter(this, dto.getData().getMovies());
        xrvMain.setAdapter(mAdapter);
    }
}
