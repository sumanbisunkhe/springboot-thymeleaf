package com.example.springbootproject.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class UserDto {
    private Long id;
    @NotEmpty(message = "Name is required")
    private String name;

    @NotNull(message= "Age is required")
    @Min(value = 0, message = "Age must be a positive number")
    private Integer age;

    @NotEmpty(message = "Address is required")
    private String address;

    @NotEmpty(message = "Phone number is required")
    private String phone;

    public UserDto() {
    }

    public UserDto(Long id, String name, Integer age, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
