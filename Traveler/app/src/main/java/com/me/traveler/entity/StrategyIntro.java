package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyIntro {
    @SerializedName("city_code")
    private String mCityCode;
    @SerializedName("guide_info")
    private String mGuideInfo;
    @SerializedName("guides_line_order")
    private String mGuidesLineOrder;
    @SerializedName("guides_title")
    private String mGuidesTitle;
    @SerializedName("item_description")
    private String mItemDescription;
    @SerializedName("item_outlined")
    private String mItemOutlined;
    @SerializedName("item_picture")
    private String mItemPicture;
    @SerializedName("item_type")
    private String mItemType;
    @SerializedName("position_x")
    private String mPositionX;
    @SerializedName("position_y")
    private String mPositionY;
    @SerializedName("scenic_spot_code")
    private String mScenicSpotCode;
    @SerializedName("sub_order")
    private String mSubOrder;

    public String getCityCode() {
        return mCityCode;
    }

    public void setCityCode(String cityCode) {
        mCityCode = cityCode;
    }

    public String getGuideInfo() {
        return mGuideInfo;
    }

    public void setGuideInfo(String guideInfo) {
        mGuideInfo = guideInfo;
    }

    public String getGuidesLineOrder() {
        return mGuidesLineOrder;
    }

    public void setGuidesLineOrder(String guidesLineOrder) {
        mGuidesLineOrder = guidesLineOrder;
    }

    public String getGuidesTitle() {
        return mGuidesTitle;
    }

    public void setGuidesTitle(String guidesTitle) {
        mGuidesTitle = guidesTitle;
    }

    public String getItemDescription() {
        return mItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        mItemDescription = itemDescription;
    }

    public String getItemOutlined() {
        return mItemOutlined;
    }

    public void setItemOutlined(String itemOutlined) {
        mItemOutlined = itemOutlined;
    }

    public String getItemPicture() {
        return mItemPicture;
    }

    public void setItemPicture(String itemPicture) {
        mItemPicture = itemPicture;
    }

    public String getItemType() {
        return mItemType;
    }

    public void setItemType(String itemType) {
        mItemType = itemType;
    }

    public String getPositionX() {
        return mPositionX;
    }

    public void setPositionX(String positionX) {
        mPositionX = positionX;
    }

    public String getPositionY() {
        return mPositionY;
    }

    public void setPositionY(String positionY) {
        mPositionY = positionY;
    }

    public String getScenicSpotCode() {
        return mScenicSpotCode;
    }

    public void setScenicSpotCode(String scenicSpotCode) {
        mScenicSpotCode = scenicSpotCode;
    }

    public String getSubOrder() {
        return mSubOrder;
    }

    public void setSubOrder(String subOrder) {
        mSubOrder = subOrder;
    }

    @Override
    public String toString() {
        return "StrategyIntro{" +
                "mCityCode='" + mCityCode + '\'' +
                ", mGuideInfo='" + mGuideInfo + '\'' +
                ", mGuidesLineOrder='" + mGuidesLineOrder + '\'' +
                ", mGuidesTitle='" + mGuidesTitle + '\'' +
                ", mItemDescription='" + mItemDescription + '\'' +
                ", mItemOutlined='" + mItemOutlined + '\'' +
                ", mItemPicture='" + mItemPicture + '\'' +
                ", mItemType='" + mItemType + '\'' +
                ", mPositionX='" + mPositionX + '\'' +
                ", mPositionY='" + mPositionY + '\'' +
                ", mScenicSpotCode='" + mScenicSpotCode + '\'' +
                ", mSubOrder='" + mSubOrder + '\'' +
                '}';
    }
}
