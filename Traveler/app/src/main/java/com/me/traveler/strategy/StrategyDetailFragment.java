package com.me.traveler.strategy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.me.traveler.R;
import com.me.traveler.entity.StrategyInfo;
import com.me.traveler.entity.StrategyIntro;

import java.util.ArrayList;
import java.util.List;

public class StrategyDetailFragment extends Fragment implements IStrategyDetailView{
    private static final String ARG_PARAM1 = "GuidesId";
    private String mGuidesId;
    private StrategyDetailPresenter mPresenter;
    private StrategyDetailAdapter mAdapter;
    private List<StrategyIntro> mInfoList = new ArrayList<>();

    private OnFragmentInteractionListener mListener;

    public StrategyDetailFragment() {
        // Required empty public constructor
    }

    public static StrategyDetailFragment newInstance(String param1) {
        StrategyDetailFragment fragment = new StrategyDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mGuidesId = getArguments().getString(ARG_PARAM1);
        }
        mPresenter = new StrategyDetailPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_strategy_detail, container, false);
        initControls(rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadStrategyDetail(mGuidesId);
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
    public void showStrategyDetail(List<StrategyIntro> list) {
        mInfoList.clear();
        mInfoList.addAll(list);
        mAdapter.notifyDataSetChanged();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void initControls(View view){
        RecyclerView details = (RecyclerView)view.findViewById(R.id.recycler);
        details.setHasFixedSize(true);
        details.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new StrategyDetailAdapter(mInfoList);
        details.setAdapter(mAdapter);
    }
}
