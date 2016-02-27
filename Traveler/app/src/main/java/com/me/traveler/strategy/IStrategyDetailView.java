package com.me.traveler.strategy;

import com.me.traveler.entity.StrategyInfo;
import com.me.traveler.entity.StrategyIntro;

import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public interface IStrategyDetailView {
    void showStrategyDetail(List<StrategyIntro> list);
}
