package com.hanbada.shopminer.data.source.remote;

import com.hanbada.shopminer.model.OrderResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SOService {

    String testURL = "";
    @GET(testURL)
    Call<OrderResponse> getAnswers();






}
