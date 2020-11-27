package com.beebeom.a14_viewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //기존 ViewPager 가 Deprecated 돼서 ViewPager2 다시 배움
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);

        //어댑터 생성
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(this);
        //어댑터는 프래그먼트가 아니라면
        //새로운 풀사이즈 레이아웃을 만들어서 리사이클러뷰로 만들 수 있음.
        viewPager2.setAdapter(adapter);

        //탭 레이아웃 연결
        //탭에 아이콘도 넣을 수 있음
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(position + "번째 페이지")).attach();

    }
}