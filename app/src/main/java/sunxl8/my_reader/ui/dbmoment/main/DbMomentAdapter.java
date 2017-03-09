package sunxl8.my_reader.ui.dbmoment.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding.view.RxView;
import com.trello.rxlifecycle.android.FragmentEvent;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseFragment;
import sunxl8.my_reader.net.doubanmoment.dto.ColumnBean;
import sunxl8.my_reader.ui.dbmoment.columns.ColumnPostActivity;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DbMomentAdapter extends RecyclerView.Adapter<DbMomentAdapter.ViewHolder> {

    private BaseFragment mFragment;
    private List<ColumnBean> mBeanList;

    public DbMomentAdapter(BaseFragment fragment, List<ColumnBean> beanList) {
        mFragment = fragment;
        mBeanList = beanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = new ViewHolder(LayoutInflater.from(mFragment.getContext()).inflate(R.layout.item_moment_dbmoment, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ColumnBean bean = mBeanList.get(position);
        holder.ivIcon.setImageURI(bean.getIcon());
        holder.tvTitle.setText(bean.getName());
        RxView.clicks(holder.layoutItem)
                .compose(mFragment.bindUntilEvent(FragmentEvent.DESTROY))
                .subscribe(aVoid -> {
                    ColumnPostActivity.startColumnPostActivity(mFragment.getContext(), bean.getId());
                });
    }

    @Override
    public int getItemCount() {
        return mBeanList == null ? 0 : mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.layout_item_columns)
        LinearLayout layoutItem;
        @BindView(R.id.iv_item_columns)
        SimpleDraweeView ivIcon;
        @BindView(R.id.tv_item_columns)
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
