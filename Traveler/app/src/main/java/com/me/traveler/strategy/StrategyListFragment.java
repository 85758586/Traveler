package com.me.traveler.strategy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.traveler.R;
import com.me.traveler.entity.Strategy;
import com.me.traveler.entity.StrategyList;

import java.util.ArrayList;
import java.util.List;


public class StrategyListFragment extends Fragment implements IStrategyListView{

    private StrategyListPresenter mPresenter;
    private StrategyListAdapter mAdapter;
    private List<Strategy> mStrategyList = new ArrayList<>();

    public StrategyListFragment() {
        // Required empty public constructor
    }


    public static StrategyListFragment newInstance() {
        StrategyListFragment fragment = new StrategyListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new StrategyListPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_strategy_list, container, false);
        initControls(rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadStrategyList();
    }

    @Override
    public void showStrategyList(StrategyList response) {
        mStrategyList.clear();
        mStrategyList.addAll(response.getData());
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onStrategyClicked(Strategy strategy) {
        Intent intent = new Intent(getContext(), StrategyDetailActivity.class);
        intent.putExtra("GuidesId", strategy.getGuidesId());
        startActivity(intent);
    }

    private void initControls(View view){
        RecyclerView strategyList = (RecyclerView)view.findViewById(R.id.recycler);
        strategyList.setHasFixedSize(true);
        strategyList.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new StrategyListAdapter(mStrategyList, this);
        strategyList.setAdapter(mAdapter);
    }
}
