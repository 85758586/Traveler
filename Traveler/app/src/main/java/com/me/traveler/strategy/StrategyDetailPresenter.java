package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyDay;
import com.me.traveler.entity.StrategyDetailResponse;
import com.me.traveler.entity.StrategyInfo;
import com.me.traveler.entity.StrategyIntro;
import com.me.traveler.entity.StrategyResponse;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailPresenter {

    private IStrategyDetailView mView;
    private StrategyDetailService mService;

    public StrategyDetailPresenter(IStrategyDetailView view){
        mView = view;
        mService = new StrategyDetailService();
    }

    public void loadStrategyDetail(String guidesId){
        StrategyDetailRequest request = new StrategyDetailRequest("" , guidesId);
        mService.getStrategyDetail(request.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StrategyDetailResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(StrategyDetailResponse strategyDetailResponse) {

                        mView.showStrategyDetail(strategyDetailResponse.getData().getGuidesInfoData().get(0).getStrategyIntro());
                    }
                });
//                .flatMap(new Func1<StrategyDetailResponse, Observable<StrategyDay>>() {
//                    @Override
//                    public Observable<StrategyDay> call(StrategyDetailResponse response) {
//                        return Observable.from(response.getData());
//                    }
//                })
//                .subscribe(new Observer<StrategyDay>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        e.printStackTrace();
//                    }
//
//                    @Override
//                    public void onNext(StrategyDay strategyDay) {
//                        mView.showStrategyDetail(strategyDay.getStrategyIntro());
//                    }
//                });

    }
}
