package com.me.traveler.strategy;

import com.me.traveler.constant.Api;
import com.me.traveler.entity.StrategyDetailResponse;
import com.me.traveler.entity.StrategyInfo;
import com.me.traveler.entity.StrategyResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public interface IStrategyDetailApi {
    @GET(Api.STRATEGY_INFO)
    Observable<StrategyDetailResponse> getStrategyDetail(@Query("RequestJson") String request);
}
