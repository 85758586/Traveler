package com.me.traveler.strategy;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.me.traveler.R;

public class StrategyListActivity extends AppCompatActivity implements StrategyListFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_list);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new StrategyListFragment())
                    .commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
