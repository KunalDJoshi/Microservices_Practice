package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getUserId(){
        return userId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setContacts(List<Contact> contacts){
        this.contacts = contacts;
    }

    public List<Contact> getContacts(){
        return contacts;
    }
}
