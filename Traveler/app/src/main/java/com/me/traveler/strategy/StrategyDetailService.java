package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyDetailResponse;
import com.me.traveler.entity.StrategyInfo;
import com.me.traveler.entity.StrategyResponse;
import com.me.traveler.http.RetrofitApiProviderImpl;

import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailService {
    private IStrategyDetailApi mService;
    private RetrofitApiProviderImpl<IStrategyDetailApi> mProvider;

    public StrategyDetailService(){
        mProvider = new RetrofitApiProviderImpl<>();
        mService = mProvider.getRetrofitApi(IStrategyDetailApi.class);
    }

    public Observable<StrategyDetailResponse> getStrategyDetail(String request){
        return mService.getStrategyDetail(request);
    }
}
