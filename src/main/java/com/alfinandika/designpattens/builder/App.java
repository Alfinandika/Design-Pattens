package com.alfinandika.designpattens.builder;

public class App {

    public static void main(String[] args){
        Customer customer1 = new CustomerBuilder()
                .setId(1)
                .build();

        Customer customer2 = new CustomerBuilder()
                .setId(1)
                .setFirstName("Alfin")
                .setLastname("Andika")
                .build();
    }
}
