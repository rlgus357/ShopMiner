package com.hanbada.shopminer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    //@Expose 어노테이션은 이 필드가 JSON 직렬화 또는 비 직렬화에 노출 되어야함을 의미

    //  @SerializedName
    //  JSON 키가 Java 필드와 마찬가지로 quotaRemaining인 경우 Gson이 자동으로 @SerializedName 어노테이션이 필요하지 않습니다.
    //  (하지만 어플리케이션을 Release 할 때 소스코드가 난독화 되어지기 때문에 Java 필드가 변환됩니다. 그렇기 때문에 @SerializedName는 필수로 사용하는 것이 좋습니다.)

    @SerializedName("shopInfo")
    @Expose
    private ShopInfo shopinfo;

    @SerializedName("paymentWaitCases")
    @Expose
    private Integer paymentWaitCases;

    @SerializedName("newOrderCases")
    @Expose
    private Integer newOrderCases;

    @SerializedName("deliveryPreparingCases")
    @Expose
    private Integer deliveryPreparingCases;

    @SerializedName("deliveringCases")
    @Expose
    private Integer deliveringCases;

    @SerializedName("deliveredCases")
    @Expose
    private Integer deliveredCases;

    public ShopInfo getShopinfo() {
        return shopinfo;
    }

    public void setShopinfo(ShopInfo shopinfo) {
        this.shopinfo = shopinfo;
    }

    public Integer getPaymentWaitCases() {
        return paymentWaitCases;
    }

    public void setPaymentWaitCases(Integer paymentWaitCases) {
        this.paymentWaitCases = paymentWaitCases;
    }

    public Integer getNewOrderCases() {
        return newOrderCases;
    }

    public void setNewOrderCases(Integer newOrderCases) {
        this.newOrderCases = newOrderCases;
    }

    public Integer getDeliveryPreparingCases() {
        return deliveryPreparingCases;
    }

    public void setDeliveryPreparingCases(Integer deliveryPreparingCases) {
        this.deliveryPreparingCases = deliveryPreparingCases;
    }

    public Integer getDeliveringCases() {
        return deliveringCases;
    }

    public void setDeliveringCases(Integer deliveringCases) {
        this.deliveringCases = deliveringCases;
    }

    public Integer getDeliveredCases() {
        return deliveredCases;
    }

    public void setDeliveredCases(Integer deliveredCases) {
        this.deliveredCases = deliveredCases;
    }
}
