package com.example.myapplication.obj;

public class Receiver extends User {
    //String status;
    Order order_obj;

    public Receiver(Order order_obj, String username, String password){
        super(username, password);
        this.order_obj = order_obj;
    }
    //order_obj.showOnMap();

    public void acceptRequest(){}

    public void declineRequest(){}
}

