package com.hanbada.shopminer.networkUtils;

import com.hanbada.shopminer.model.OrderResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiUtils {

    @GET("test")
    Call<OrderResponse> getOrderList(@Query("test") String orderSource, @Query("apiKey") String apiKey);

}
