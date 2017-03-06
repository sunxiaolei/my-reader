package sunxl8.my_reader.ui.dbmoment.columns;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.net.dbmoment.dto.ColumnPostDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnPostActivity extends BaseActivity<ColumnPostPresenter> implements ColumnPostContract.View {

    @BindView(R.id.xrv_columnpost)
    XRecyclerView xrvColumnPost;

    private ColumnPostAdapter mAdapter;

    @Override
    protected ColumnPostPresenter createPresenter() {
        return new ColumnPostPresenter(this);
    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_moment_columnpost;
    }

    @Override
    protected void initData() {
        int id = getIntent().getIntExtra("id", 0);
        mPresenter.getColumnPost(id);
    }

    @Override
    protected void initView() {
        xrvColumnPost.setLayoutManager(new LinearLayoutManager(this));
    }

    public static void startColumnPostActivity(Context context, int id) {
        Intent intent = new Intent(context, ColumnPostActivity.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }

    @Override
    public void setColumnPost(ColumnPostDto dto) {
        mAdapter = new ColumnPostAdapter(this, dto.getPosts());
        xrvColumnPost.setAdapter(mAdapter);
    }

    @Override
    public void error(String msg) {

    }
}
