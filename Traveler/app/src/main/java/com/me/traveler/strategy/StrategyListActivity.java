package com.me.traveler.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.me.traveler.R;

public class StrategyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_list);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, StrategyListFragment.newInstance())
                    .commit();
        }

    }

}
