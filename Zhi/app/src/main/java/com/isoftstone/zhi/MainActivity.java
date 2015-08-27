package com.isoftstone.zhi;

import android.app.ActionBar;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.isoftstone.zhi.adapter.TestViewPagerAdapter;


public class MainActivity extends FragmentActivity {
        public final static int TAB_INDEX_TAB_1 = 0;
       public final static int TAB_INDEX_TAB_2 = 1;
       public final static int TAB_INDEX_TAB_3 = 2;
        public final static int TAB_INDEX_TAB_4 = 3;
        public final static int TAB_COUNT = 4;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // 创建Tab
               setupTest1();
                setupTest2();
               setupTest3();
                setupTest4();
               getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                getActionBar().setDisplayShowTitleEnabled(false);
               getActionBar().setDisplayShowHomeEnabled(false);

        //创建viewpager
        mViewPager = (ViewPager) findViewById(R.id.pager);
        getFragmentManager();

        mViewPager.setAdapter(new TestViewPagerAdapter(getSupportFragmentManager()));
        mViewPager.setOnPageChangeListener(new TestPagerListener());
        mViewPager.setCurrentItem(TAB_INDEX_TAB_2);
    }

    private void setupTest1() {
                 Tab tab = this.getActionBar().newTab();
                tab.setContentDescription("Tab 1");
                tab.setText("Tab 1");
                tab.setTabListener(mTabListener);
               getActionBar().addTab(tab);
    }

    private void setupTest2() {
        Tab tab = this.getActionBar().newTab();
        tab.setContentDescription("Tab 2");
        tab.setText("Tab 2");
        tab.setTabListener(mTabListener);
        getActionBar().addTab(tab);
    }

    private void setupTest3() {
        Tab tab = this.getActionBar().newTab();
        tab.setContentDescription("Tab 3");
        tab.setText("Tab 3");
        tab.setTabListener(mTabListener);
        getActionBar().addTab(tab);
    }

    private void setupTest4() {
        Tab tab = this.getActionBar().newTab();
        tab.setContentDescription("Tab 4");
        tab.setText("Tab 4");
        tab.setTabListener(mTabListener);
        getActionBar().addTab(tab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    TabListener mTabListener = new TabListener()
    {
        private  final static  String TAG ="mTabListener";
        @Override
        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Log.i(TAG,"onTabSelected===========");
            if(mViewPager == null){
                mViewPager.setCurrentItem(tab.getPosition());
            }
        }

        @Override
        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            Log.i(TAG,"onTabUnselected===========");
        }

        @Override
        public void onTabReselected(Tab tab, FragmentTransaction ft) {
            Log.i(TAG,"onTabReselected===========");
        }
    };
    class  TestPagerListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            getActionBar().selectTab(getActionBar().getTabAt(i));
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }
}
