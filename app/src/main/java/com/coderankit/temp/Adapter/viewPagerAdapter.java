package com.coderankit.temp.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.coderankit.temp.Fragments.item1_Fragment;
import com.coderankit.temp.Fragments.item2_Fragment;
import com.coderankit.temp.Fragments.item3_Fragment;

public class viewPagerAdapter extends FragmentPagerAdapter {
    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new item1_Fragment();
        }
        else if (position == 1){
            return new item2_Fragment();
        }
        else {
            return new item3_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3 ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Item 1";
        }
        else if(position == 1){
            return "Item 2";
        }
        else {
            return "Item 3";
        }
    }
}
