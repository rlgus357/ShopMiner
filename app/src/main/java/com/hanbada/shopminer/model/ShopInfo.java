package com.hanbada.shopminer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShopInfo {

    @SerializedName("shopName")
    @Expose
    private String shopName;

    @SerializedName("shopStatus")
    @Expose
    private int shopStatus;


}
