package com.data.btvnss11.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Login {
    @NotBlank(message = "Tai khoan khong duoc de trong")
    String email;
    @NotBlank(message = "Mat khau khong duoc de trong")
    @Size(message = "Size cua mat khau min = 8" , min = 8)
    String password;
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public Login() {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
