package com.data.btvnss11.model;


import javax.validation.constraints.NotBlank;

public class User_bt6 {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Số điện thoại không được để trống")
    private String phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
