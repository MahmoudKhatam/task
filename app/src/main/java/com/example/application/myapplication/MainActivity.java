package com.example.application.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tableLayout, tabLayout0 ;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager ,viewPager0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        tabLayout0 =(TabLayout) findViewById(R.id.tabLayout);
        viewPager0 = (ViewPager) findViewById(R.id.viewPager);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new FragmentElakharen(),"الاخرين");
        pagerAdapter.addFragment(new FragmentFazaty(),"فزعاتي");
        viewPager0.setAdapter(pagerAdapter);
        tabLayout0.setupWithViewPager(viewPager0);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentTm_elelgha(),"تم الالغاء");
        adapter.addFragment(new FragmentTm_elqobol(),"تم القبول");
        adapter.addFragment(new FragmentQyd_elentzar(),"قيد الانتظار");

        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);
    }
}