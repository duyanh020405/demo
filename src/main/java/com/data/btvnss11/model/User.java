package com.data.btvnss11.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Ten khong duoc de trong !")
    String name ;
    @Email(message = "email dung dinh dang")
    String email ;
    String phone ;
    @Size(min = 2, max = 20 , message = "mat khau tu 2 -> 10 ky tu")
    String password ;
    Boolean status ;
    public User (String name, String email, String phone, String password, Boolean status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }
    public User (){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
