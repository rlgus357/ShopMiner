package com.hanbada.shopminer.component;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.hanbada.shopminer.R;
import com.hanbada.shopminer.adapters.OrderAdapter;
import com.hanbada.shopminer.model.Order;

import java.util.ArrayList;
import java.util.List;

import viewmodel.OrderViewModel;

public class MainActivity extends AppCompatActivity  {

    ArrayList<Order> orderArrayList = new ArrayList<>() ;
    OrderAdapter orderAdapter;
    RecyclerView rvShopInfo;
    OrderViewModel orderViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // test commit
        setContentView(R.layout.activity_main);
        //rvShopInfo = findViewById(R.id.rvShopInfo);

        orderViewModel = ViewModelProviders.of(this).get(OrderViewModel.class);
        orderViewModel.init();
        /*orderViewModel.getOrderRepository().observe(this, orderResponse ->{
            //List<Order> orders = orderResponse.get
        });*/
    }

    /*
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // test commit
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }*/

}
