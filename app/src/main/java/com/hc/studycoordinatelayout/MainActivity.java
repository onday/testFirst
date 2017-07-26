package com.hc.studycoordinatelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depend);
        /*getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout ctbarlayout = (CollapsingToolbarLayout) findViewById(R.id.ctbarlayout);
        ctbarlayout.setContentScrimResource(R.drawable.icon);
        toolbar.setTitle("好吧。");
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);*/


    }
}
