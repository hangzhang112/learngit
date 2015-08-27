package com.isoftstone.zhi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.isoftstone.zhi.MainActivity;
import com.isoftstone.zhi.fragment.Tab1Fragment;
import com.isoftstone.zhi.fragment.Tab2Fragment;
import com.isoftstone.zhi.fragment.Tab3Fragment;
import com.isoftstone.zhi.fragment.Tab4Fragment;

/**
 * Created by Administrator on 2015/8/20 0020.
 */
public class TestViewPagerAdapter extends FragmentPagerAdapter {

    public TestViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case MainActivity.TAB_INDEX_TAB_1:
            return new Tab1Fragment();
            case MainActivity.TAB_INDEX_TAB_2:
                return new Tab2Fragment();
            case MainActivity.TAB_INDEX_TAB_3:
                return new Tab3Fragment();
            case MainActivity.TAB_INDEX_TAB_4:
                return new Tab4Fragment();

        }
       throw new IllegalStateException("没有fragment"+i);
    }

    @Override
    public int getCount() {
        return MainActivity.TAB_COUNT;
    }
}
