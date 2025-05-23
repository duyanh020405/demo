package com.data.btvnss11.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User_bt5 {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotBlank(message = "Vai trò không được để trống")
    private String role;

    private String adminCode;

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

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getAdminCode() {
        return adminCode;
    }
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
}
