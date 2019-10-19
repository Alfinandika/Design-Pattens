package com.alfinandika.designpattens.builder;

public class CustomerBuilder {
    private int id;
    private String firstName;
    private String lastname;
    private String email;
    private String phone;
    private String age;
    private String address;

    public Customer build(){
        return new Customer(
                this.id,
                this.firstName,
                this.lastname,
                this.email,
                this.phone,
                this.age,
                this.address

        );
    }

    public CustomerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}
