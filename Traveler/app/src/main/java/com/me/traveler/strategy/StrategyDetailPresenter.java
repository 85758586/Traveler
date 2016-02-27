package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyDetail;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailPresenter {

    private IStrategyDetailView mView;
    private IStrategyApiService mService;

    public StrategyDetailPresenter(IStrategyDetailView view){
        mView = view;
        mService = new StrategyApiService();
    }

    public void loadStrategyDetail(String guidesId){
        StrategyDetailRequest request = new StrategyDetailRequest("" , guidesId);
        mService.getStrategyDetail(request.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StrategyDetail>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(StrategyDetail strategyDetail) {

                        mView.showStrategyDetail(strategyDetail.getData().getGuidesInfoData().get(0).getStrategyIntro());
                    }
                });

    }
}
