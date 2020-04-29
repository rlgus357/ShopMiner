package com.hanbada.shopminer.networkUtils;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.hanbada.shopminer.model.OrderResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrderRepository {

    private static OrderRepository orderRepository;

    public static OrderRepository getInstance(){
        if(orderRepository == null){
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }

    private ApiUtils orderApi;

    public OrderRepository(){
        orderApi = RetrofitService.createService(ApiUtils.class);
    }

    public MutableLiveData<OrderResponse> getOrders(String source, String key){
        final MutableLiveData<OrderResponse> orderData = new MutableLiveData<>();
        // enqueue는 비동기 처리 Request보낸후 Response가 돌아왔을때 앱에게 알림.
        // onReponse, onFaiilure을 구현해야함.
        orderApi.getOrderList(source, key).enqueue(new Callback<OrderResponse>(){
            @Override
            public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response){
                if(response.isSuccessful()) {
                    orderData.setValue(response.body());
                }else{
                    int statusCode = response.code();
                    Log.d(this.getClass().toString() , "error loading from API");
                }
            }
            @Override
            public void onFailure(Call <OrderResponse> call, Throwable t){
                orderData.setValue(null);
            }
        });
        return orderData;
    }
}
