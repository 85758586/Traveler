package com.me.traveler.strategy;

import com.me.traveler.constant.Api;
import com.me.traveler.entity.StrategyDetail;
import com.me.traveler.entity.StrategyList;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/26.
 */
public interface IStrategyApi {
    @GET(Api.STRATEGY)
    Observable<StrategyList> getStrategyList(@Query("RequestJson") String request);

    @GET(Api.STRATEGY_INFO)
    Observable<StrategyDetail> getStrategyDetail(@Query("RequestJson") String request);
}
