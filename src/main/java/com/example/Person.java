package com.example;

public abstract class Person {
    private String id;
    private String name;
    private String address;
    private String phone;
    
    public Person(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address + ", Phone: " + phone;
    }
}

