package sunxl8.my_reader.ui.maoyan.main;

import android.support.v7.widget.CardView;
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
import sunxl8.my_reader.net.maoyanmovie.dto.MainListDto;

/**
 * Created by sunxl8 on 2017/3/6.
 */

public class MaoyanMovieAdapter extends RecyclerView.Adapter<MaoyanMovieAdapter.ViewHolder> {

    private MaoyanMovieFragment mFragment;
    private List<MainListDto.DataBean.MoviesBean> mBeanList;

    public MaoyanMovieAdapter(MaoyanMovieFragment fragment, List<MainListDto.DataBean.MoviesBean> beanList) {
        mFragment = fragment;
        mBeanList = beanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = new ViewHolder(LayoutInflater.from(mFragment.getContext()).inflate(R.layout.item_maoyanmovie_main, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MainListDto.DataBean.MoviesBean bean = mBeanList.get(position);
        Glide.with(mFragment.getActivity()).load(bean.getImg()).into(holder.ivItem);
        holder.tvTitle.setText(bean.getNm());
    }

    @Override
    public int getItemCount() {
        return mBeanList == null ? 0 : mBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cv_maoyanmovie_main_item)
        CardView cvItem;
        @BindView(R.id.iv_maoyanmovie_main_item)
        ImageView ivItem;
        @BindView(R.id.tv_maoyanmovie_main_title)
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}