package com.jt.intro_to_web;

public class person {
    private String name;
    private String phone;


    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
        System.out.println("Name setter");
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("phone setter");
    }
    
    
}
