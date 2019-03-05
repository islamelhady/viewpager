package com.elhady.viewpager;

import android.content.ContentResolver;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by El-hady on 4/19/2018.
 */
public class PagerAdapter extends FragmentPagerAdapter{

    final int PAGE_COUNT=3;
    private String tapTitles[] = new String[]{"Top","islam","sayed"};
    Context context;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tapTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentA fragmentA = new FragmentA();
                return fragmentA;
            case 1:
                FragmentB fragmentB = new FragmentB();
                return fragmentB;
            case 2:
                FragmentC fragmentC = new FragmentC();
                return fragmentC;
        }
        return null;
    }
}
