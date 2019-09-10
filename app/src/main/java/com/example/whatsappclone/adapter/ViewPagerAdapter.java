package com.example.whatsappclone.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.whatsappclone.AppConstants;
import com.example.whatsappclone.fragment.CameraFragment;
import com.example.whatsappclone.fragment.ListFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int[] data;

    public ViewPagerAdapter(FragmentManager fm, int[] data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new CameraFragment();
            case 1:
                return ListFragment.newInstance(data[i], AppConstants.CHATS);
            case 2:
                return ListFragment.newInstance(data[i], AppConstants.STATUS);
            case 3:
                return ListFragment.newInstance(data[i], AppConstants.CALLS);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }


}
