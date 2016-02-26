package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/2/26.
 */
public class Strategy {
    @SerializedName("guides_name")
    private String mGuidesName;
    @SerializedName("collect_amount")
    private String mCollectAmount;
    @SerializedName("trip_days")
    private String mTripDays;
    @SerializedName("guides_pic")
    private String mGuidesPic;
    @SerializedName("is_user")
    private String mIsUser;
    @SerializedName("praise_amount")
    private String mPraiseAmount;
    @SerializedName("guides_id")
    private String mGuidesId;
    @SerializedName("is_praise")
    private String mIsPraise;
    @SerializedName("upd_date")
    private String mUpdDate;
    @SerializedName("guides_description")
    private String mGuidesDescription;
    @SerializedName("comment_amount")
    private String mCommentAmount;
    @SerializedName("is_collect")
    private String mIsCollect;
    @SerializedName("is_new")
    private String mIsNew;
    @SerializedName("member_photo")
    private String mMemberPhoto;
    @SerializedName("is_hot")
    private String mIsHot;
    @SerializedName("member_name")
    private String mMemberName;
    @SerializedName("recommend_status")
    private String mRecommendStatus;

    public String getCollectAmount() {
        return mCollectAmount;
    }

    public void setCollectAmount(String collectAmount) {
        mCollectAmount = collectAmount;
    }

    public String getCommentAmount() {
        return mCommentAmount;
    }

    public void setCommentAmount(String commentAmount) {
        mCommentAmount = commentAmount;
    }

    public String getGuidesDescription() {
        return mGuidesDescription;
    }

    public void setGuidesDescription(String guidesDescription) {
        mGuidesDescription = guidesDescription;
    }

    public String getGuidesId() {
        return mGuidesId;
    }

    public void setGuidesId(String guidesId) {
        mGuidesId = guidesId;
    }

    public String getGuidesName() {
        return mGuidesName;
    }

    public void setGuidesName(String guidesName) {
        mGuidesName = guidesName;
    }

    public String getGuidesPic() {
        return mGuidesPic;
    }

    public void setGuidesPic(String guidesPic) {
        mGuidesPic = guidesPic;
    }

    public String getIsCollect() {
        return mIsCollect;
    }

    public void setIsCollect(String isCollect) {
        mIsCollect = isCollect;
    }

    public String getIsHot() {
        return mIsHot;
    }

    public void setIsHot(String isHot) {
        mIsHot = isHot;
    }

    public String getIsNew() {
        return mIsNew;
    }

    public void setIsNew(String isNew) {
        mIsNew = isNew;
    }

    public String getIsPraise() {
        return mIsPraise;
    }

    public void setIsPraise(String isPraise) {
        mIsPraise = isPraise;
    }

    public String getIsUser() {
        return mIsUser;
    }

    public void setIsUser(String isUser) {
        mIsUser = isUser;
    }

    public String getMemberName() {
        return mMemberName;
    }

    public void setMemberName(String memberName) {
        mMemberName = memberName;
    }

    public String getMemberPhoto() {
        return mMemberPhoto;
    }

    public void setMemberPhoto(String memberPhoto) {
        mMemberPhoto = memberPhoto;
    }

    public String getPraiseAmount() {
        return mPraiseAmount;
    }

    public void setPraiseAmount(String praiseAmount) {
        mPraiseAmount = praiseAmount;
    }

    public String getRecommendStatus() {
        return mRecommendStatus;
    }

    public void setRecommendStatus(String recommendStatus) {
        mRecommendStatus = recommendStatus;
    }

    public String getTripDays() {
        return mTripDays;
    }

    public void setTripDays(String tripDays) {
        mTripDays = tripDays;
    }

    public String getUpdDate() {
        return mUpdDate;
    }

    public void setUpdDate(String updDate) {
        mUpdDate = updDate;
    }

    @Override
    public String toString() {
        return "Strategy{" +
                "mCollectAmount='" + mCollectAmount + '\'' +
                ", mGuidesName='" + mGuidesName + '\'' +
                ", mTripDays='" + mTripDays + '\'' +
                ", mGuidesPic='" + mGuidesPic + '\'' +
                ", mIsUser='" + mIsUser + '\'' +
                ", mPraiseAmount='" + mPraiseAmount + '\'' +
                ", mGuidesId='" + mGuidesId + '\'' +
                ", mIsPraise='" + mIsPraise + '\'' +
                ", mUpdDate='" + mUpdDate + '\'' +
                ", mGuidesDescription='" + mGuidesDescription + '\'' +
                ", mCommentAmount='" + mCommentAmount + '\'' +
                ", mIsCollect='" + mIsCollect + '\'' +
                ", mIsNew='" + mIsNew + '\'' +
                ", mMemberPhoto='" + mMemberPhoto + '\'' +
                ", mIsHot='" + mIsHot + '\'' +
                ", mMemberName='" + mMemberName + '\'' +
                ", mRecommendStatus='" + mRecommendStatus + '\'' +
                '}';
    }
}
