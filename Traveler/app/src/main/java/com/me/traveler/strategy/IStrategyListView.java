package com.me.traveler.strategy;

import com.me.traveler.entity.Strategy;
import com.me.traveler.entity.StrategyList;

/**
 * Created by Administrator on 2016/2/26.
 */
public interface IStrategyListView {
    void showStrategyList(StrategyList response);
    void onStrategyClicked(Strategy strategy);
}
