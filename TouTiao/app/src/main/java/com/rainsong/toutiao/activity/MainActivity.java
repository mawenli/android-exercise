package com.rainsong.toutiao.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.rainsong.toutiao.R;
import com.rainsong.toutiao.fragment.DiscoverFragment;
import com.rainsong.toutiao.fragment.TabNewsFragment;
import com.rainsong.toutiao.fragment.TabVideoFragment;
import com.rainsong.toutiao.fragment.UserCentralFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar
        .OnTabSelectedListener {
    private static final String TAG = "MainActivity";

    private BottomNavigationBar bottomNavigationBar;
    private TabNewsFragment mTabNewsFragment;
    private TabVideoFragment mTabVideoFragment;
    private DiscoverFragment mDiscoverFragment;
    private UserCentralFragment mUserCentralFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setDefaultFragment();
    }

    private void initView() {
        initBottomNavigationBar();
    }

    private void initBottomNavigationBar() {
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.setTabSelectedListener(this);
        bottomNavigationBar.clearAll();
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.icon_main_news_selected, R.string.news)
                        .setInactiveIconResource(R.drawable.icon_main_news_normal)
                        .setActiveColorResource(R.color.red))
                .addItem(new BottomNavigationItem(R.drawable.icon_main_video_selected, R
                        .string.video)
                        .setInactiveIconResource(R.drawable.icon_main_video_normal)
                        .setActiveColorResource(R.color.red))
                .addItem(new BottomNavigationItem(R.drawable.icon_main_discover_selected, R
                        .string.discover)
                        .setInactiveIconResource(R.drawable.icon_main_discover_normal)
                        .setActiveColorResource(R.color.red))
                .addItem(new BottomNavigationItem(R.drawable.icon_main_mine_selected, R.string.mine)
                        .setInactiveIconResource(R.drawable.icon_main_mine_normal)
                        .setActiveColorResource(R.color.red))
                .initialise();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mTabNewsFragment = new TabNewsFragment();
        transaction.add(R.id.fragment_container, mTabNewsFragment);
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        Log.d(TAG, "onTabSelected() called with: " + "position = [" + position + "]");
        FragmentManager fm = getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (mTabNewsFragment == null) {
                    mTabNewsFragment = new TabNewsFragment();
                    transaction.add(R.id.fragment_container, mTabNewsFragment);
                } else {
                    transaction.attach(mTabNewsFragment);
                }
                break;
            case 1:
                if (mTabVideoFragment == null) {
                    mTabVideoFragment = new TabVideoFragment();
                    transaction.add(R.id.fragment_container, mTabVideoFragment);
                } else {
                    transaction.attach(mTabVideoFragment);
                }
                break;
            case 2:
                if (mDiscoverFragment == null) {
                    mDiscoverFragment = new DiscoverFragment();
                    transaction.add(R.id.fragment_container, mDiscoverFragment);
                } else {
                    transaction.attach(mDiscoverFragment);
                }
                break;
            case 3:
                if (mUserCentralFragment == null) {
                    mUserCentralFragment = new UserCentralFragment();
                    transaction.add(R.id.fragment_container, mUserCentralFragment);
                } else {
                    transaction.attach(mUserCentralFragment);
                }
                break;
            default:
                break;
        }
        // 事务提交
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {
        FragmentManager fm = getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (mTabNewsFragment != null) {
                    transaction.detach(mTabNewsFragment);
                }
                break;
            case 1:
                if (mTabVideoFragment != null) {
                    transaction.detach(mTabVideoFragment);
                }
                break;
            case 2:
                if (mDiscoverFragment != null) {
                    transaction.detach(mDiscoverFragment);
                }
                break;
            case 3:
                if (mUserCentralFragment != null) {
                    transaction.detach(mUserCentralFragment);
                }
                break;
            default:
                break;
        }
        // 事务提交
        transaction.commit();
    }

    @Override
    public void onTabReselected(int position) {

    }
}
