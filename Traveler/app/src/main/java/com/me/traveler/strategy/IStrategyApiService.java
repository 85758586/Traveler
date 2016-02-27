package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyDetail;
import com.me.traveler.entity.StrategyList;

import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public interface IStrategyApiService {
    Observable<StrategyList> getStrategyList(String request);
    Observable<StrategyDetail> getStrategyDetail(String request);
}
