package com.example.whatsappclone;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles = {"", "chats", "status", "calls"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new ListFragment();
            case 1:
                return new ListFragment();
            case 2:
                return new ListFragment();
            case 3:
                return new ListFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mTabTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

}
