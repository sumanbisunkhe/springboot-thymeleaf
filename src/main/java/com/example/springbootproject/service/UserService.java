package com.example.springbootproject.service;

import com.example.springbootproject.dto.UserDto;
import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    void saveUser(UserDto userDto);
    void deleteUser(Long id);
    void updateUser(UserDto userDto);  // Added update method
}
