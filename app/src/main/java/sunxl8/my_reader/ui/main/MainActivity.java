package sunxl8.my_reader.ui.main;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.jakewharton.rxbinding.view.RxView;
import com.trello.rxlifecycle.android.ActivityEvent;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import rx.functions.Action1;
import sunxl8.my_reader.R;
import sunxl8.my_reader.base.BaseActivity;
import sunxl8.my_reader.base.IPresenter;
import sunxl8.my_reader.ui.dbmoment.main.DbMomentFragment;
import sunxl8.my_reader.ui.maoyan.main.MaoyanMovieFragment;
import sunxl8.my_reader.ui.setting.SettingActivity;

public class MainActivity extends BaseActivity {

    private String[] mTitles = {"豆瓣一刻", "猫眼电影", "..."};

    @BindView(R.id.tab_main)
    TabLayout mTabLayout;
    @BindView(R.id.vp_main)
    ViewPager mViewPager;

    private List<Fragment> mFragments;

    @Override
    protected IPresenter createPresenter() {
        return null;
    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new DbMomentFragment());
        mFragments.add(new MaoyanMovieFragment());
        mFragments.add(new DbMomentFragment());
    }

    @Override
    protected void initView() {
        toolbarTitle.setText("MyReader");
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mViewPager.setOffscreenPageLimit(3);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setupWithViewPager(mViewPager);
        toolbarIcon.setVisibility(View.VISIBLE);
        toolbarIcon.setImageResource(R.drawable.ic_setting);
        RxView.clicks(toolbarIcon)
                .compose(this.bindUntilEvent(ActivityEvent.DESTROY))
                .subscribe(aVoid -> {
                    startActivity(new Intent(this, SettingActivity.class));
                });
    }

    @Override
    public void error(String msg) {

    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }

}
