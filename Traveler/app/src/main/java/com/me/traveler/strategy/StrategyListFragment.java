package com.me.traveler.strategy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.me.traveler.R;
import com.me.traveler.entity.Strategy;
import com.me.traveler.entity.StrategyResponse;

import java.util.ArrayList;
import java.util.List;


public class StrategyListFragment extends Fragment implements IStrategyListView{

    private OnFragmentInteractionListener mListener;
    private StrategyListPresenter mPresenter;
    private StrategyListAdapter mAdapter;
    private List<Strategy> mStrategyList;

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

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void showStrategyList(StrategyResponse response) {
        mStrategyList = response.getData();
        mAdapter.setDataList(mStrategyList);
        mAdapter.notifyDataSetChanged();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void initControls(View view){
        final ListView strategyList = (ListView)view.findViewById(R.id.strategy_list);
        mAdapter = new StrategyListAdapter(getContext());
        strategyList.setAdapter(mAdapter);

        strategyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getContext(), StrategyDetailActivity.class);
                intent.putExtra("GuidesId", mStrategyList.get(position).getGuidesId());
                startActivity(intent);
            }
        });

    }
}
