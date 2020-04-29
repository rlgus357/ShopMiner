package viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hanbada.shopminer.model.OrderResponse;
import com.hanbada.shopminer.networkUtils.OrderRepository;

public class OrderViewModel extends ViewModel {

    private MutableLiveData<OrderResponse> mutableLiveData;
    private OrderRepository orderRepository;

    public void init(){
        if(mutableLiveData != null){
            return;
        }
        orderRepository = OrderRepository.getInstance();
        mutableLiveData = orderRepository.getOrders("test","test");
    }

    public LiveData<OrderResponse> getOrderRepository(){
        return mutableLiveData;
    }
}
