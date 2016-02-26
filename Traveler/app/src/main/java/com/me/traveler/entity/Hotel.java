package com.me.traveler.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public class Hotel {
    private static final long serialVersionUID = 1L;
    private int car_service;
    private String city_name = "";
    private List<CouponRule> couponRule_list = new ArrayList();
    private String distance = "";
    private int give_integral;
    private String hotel_cname = "";
    private String hotel_csname = "";
    private String hotel_id = "";
    private String hotel_picture = "";
    private String hotel_type = "";
    private boolean isChecked = false;
    private String isShoppingOrder = "";
    private String is_commision = "";
    private String payment_mode = "";
    private String position_x;
    private String position_y;
    private String price = "";
    private String scenic_spot_code = "";
    private String shopping_id;
    private String star_level = "";
}
