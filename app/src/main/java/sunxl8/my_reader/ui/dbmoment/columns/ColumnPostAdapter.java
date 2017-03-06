package sunxl8.my_reader.ui.dbmoment.columns;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.trello.rxlifecycle.android.ActivityEvent;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sunxl8.my_reader.R;
import sunxl8.my_reader.net.dbmoment.dto.PostsBean;
import sunxl8.my_reader.ui.dbmoment.detail.MomentDetailActivity;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class ColumnPostAdapter extends RecyclerView.Adapter<ColumnPostAdapter.ViewHolder> {

    private Context mContext;
    private ColumnPostActivity mActivity;
    private List<PostsBean> mBeanList;

    public ColumnPostAdapter(Context context, List<PostsBean> beanList) {
        mContext = context;
        mBeanList = beanList;
        mActivity = (ColumnPostActivity) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_moment_columnpost, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final PostsBean bean = mBeanList.get(position);
        holder.tvTitle.setText(bean.getTitle());
        RxView.clicks(holder.layoutItem)
                .compose(mActivity.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(aVoid -> {
                    MomentDetailActivity.startMomentDetailActivity(mContext, bean);
                });
    }

    @Override
    public int getItemCount() {
        return mBeanList == null ? 0 : mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.layout_item_columnpost)
        LinearLayout layoutItem;
        @BindView(R.id.tv_item_columnpost)
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
