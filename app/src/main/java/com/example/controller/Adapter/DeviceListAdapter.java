package com.example.controller.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.controller.Fragments.AvailableDeviceFragment;
import com.example.controller.Fragments.PairedDeviceFragment;

public class DeviceListAdapter extends FragmentPagerAdapter {


    private Context myContext;
    int totalTabs;

    public DeviceListAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AvailableDeviceFragment availableDeviceFragment = new AvailableDeviceFragment();
                return availableDeviceFragment;
            case 1:
                PairedDeviceFragment pairedDeviceFragment = new PairedDeviceFragment();
                return pairedDeviceFragment;

            default:
                return null;
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Paired Devices";
        }
        else
        {
            return "Availabe Devices";
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
