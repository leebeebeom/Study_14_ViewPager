package com.beebeom.a14_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    //프래그먼트 생성
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new BlankFragment1();
            case 1:
                return new BlankFragment2();
            default:
                return new BlankFragment3();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
