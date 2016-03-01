package com.me.traveler.strategy;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.me.traveler.R;

public class StrategyDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_detail);

        String guidesId = getIntent().getStringExtra("GuidesId");
        String title = getIntent().getStringExtra("title");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingBar = (CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        collapsingBar.setTitle(title);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "已收藏至“我的收藏”", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        if(savedInstanceState == null){
            StrategyDetailFragment fragment = StrategyDetailFragment.newInstance(guidesId);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }
    }

}
