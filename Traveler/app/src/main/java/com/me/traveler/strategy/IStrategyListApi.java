package com.me.traveler.strategy;



import com.me.traveler.constant.Api;
import com.me.traveler.entity.StrategyResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/26.
 */
public interface IStrategyListApi {
    @GET(Api.STRATEGY)
    Observable<StrategyResponse> getStrategyList(@Query("RequestJson") String request);
}
