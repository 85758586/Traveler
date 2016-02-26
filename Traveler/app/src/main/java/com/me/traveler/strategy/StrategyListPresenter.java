package com.me.traveler.strategy;

import android.util.Log;

import com.me.traveler.entity.StrategyResponse;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListPresenter {

    private IStrategyListView mView;
    private StrategyListService mService;

    public StrategyListPresenter(IStrategyListView view){
        mView = view;
        mService = new StrategyListService();
    }

    public void loadStrategyList(){
        StrategyListRequest request = new StrategyListRequest(1, 10);

        mService.getStrategyList(request.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StrategyResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.d("strategylist", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(StrategyResponse strategyResponse) {
                        mView.showStrategyList(strategyResponse);
                    }
                });
    }
}
