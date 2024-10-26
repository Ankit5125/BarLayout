package com.coderankit.temp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.coderankit.temp.Adapter.viewPagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout ;
    ViewPager viewPager ;

    TabItem i1, i2, i3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        setIds();

        //viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(new viewPagerAdapter(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setIds() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        i1 = findViewById(R.id.item1);
        i2 = findViewById(R.id.item2);
        i3 = findViewById(R.id.item3);
    }
}