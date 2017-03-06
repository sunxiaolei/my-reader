package sunxl8.my_reader.ui.main.dbmoment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sunxl8.my_reader.R;
import sunxl8.my_reader.net.dbmoment.dto.ColumnsDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class DbMomentAdapter extends RecyclerView.Adapter<DbMomentAdapter.ViewHolder> {

    private Context mContext;
    private List<ColumnsDto.ColumnsBean> mBeanList;

    public DbMomentAdapter(Context context, List<ColumnsDto.ColumnsBean> beanList) {
        mContext = context;
        mBeanList = beanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_dbmoment, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ColumnsDto.ColumnsBean bean = mBeanList.get(position);
        Glide.with(mContext).load(bean.getIcon()).into(holder.ivIcon);
        holder.tvTitle.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        return mBeanList == null ? 0 : mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_item_columns)
        ImageView ivIcon;
        @BindView(R.id.tv_item_columns)
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
