package com.me.traveler.strategy;

import com.me.traveler.entity.Ticket;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public interface IStrategyDetailApi {
    @GET
    Observable<Ticket> getStrategyDetail(@Query("RequestJson") String request);
}
