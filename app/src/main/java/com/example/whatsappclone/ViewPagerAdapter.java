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
                return new ColorFragment();
            case 1:
                return new ColorFragment();
            case 2:
                return new ColorFragment();
            case 3:
                return new ColorFragment();
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
