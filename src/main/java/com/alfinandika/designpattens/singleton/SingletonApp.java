package com.alfinandika.designpattens.singleton;

public class SingletonApp {

    public static void main(String[] args){
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("00101", "IndoMie");
        orderDetailService.save("00101", "Sabun");
        orderDetailService.save("00101", "Pepsodent");
    }
}
