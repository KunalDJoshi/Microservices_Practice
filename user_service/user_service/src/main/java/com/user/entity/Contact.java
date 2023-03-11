package com.user.entity;

public class Contact {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

    public Contact(Long cId, String email, String contactName, Long userId){
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact(){
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getcId(){
        return cId;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setContactName(String contactName){
        this.contactName = contactName;
    }

    public String getContactName(){
        return contactName;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getUserId(){
        return userId;
    }
}
