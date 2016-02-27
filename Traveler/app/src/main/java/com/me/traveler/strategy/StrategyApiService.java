package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyDetail;
import com.me.traveler.entity.StrategyList;
import com.me.traveler.http.RetrofitProviderImpl;

import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyApiService implements IStrategyApiService {

    private IStrategyApi mService;
    private RetrofitProviderImpl<IStrategyApi> mApiProvider;

    public StrategyApiService(){
        mApiProvider = new RetrofitProviderImpl<>();
        mService = mApiProvider.getRetrofitApi(IStrategyApi.class);
    }

    @Override
    public Observable<StrategyList> getStrategyList(String request) {
        return mService.getStrategyList(request);
    }

    @Override
    public Observable<StrategyDetail> getStrategyDetail(String request) {
        return mService.getStrategyDetail(request);
    }
}
