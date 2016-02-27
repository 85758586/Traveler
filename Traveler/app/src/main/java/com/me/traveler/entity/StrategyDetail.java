package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetail {
    @SerializedName("errMsg")
    private String mMsg;
    @SerializedName("resultStatus")
    private String mResultStatus;
    @SerializedName("data")
    private StrategyInfo mData;

    public StrategyInfo getData() {
        return mData;
    }

    public void setData(StrategyInfo data) {
        mData = data;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public String getResultStatus() {
        return mResultStatus;
    }

    public void setResultStatus(String resultStatus) {
        mResultStatus = resultStatus;
    }

    @Override
    public String toString() {
        return "StrategyDetailResponse{" +
                "mData=" + mData +
                ", mMsg='" + mMsg + '\'' +
                ", mResultStatus='" + mResultStatus + '\'' +
                '}';
    }
}
