package com.example.springbootproject.service.impl;

import com.example.springbootproject.dto.UserDto;
import com.example.springbootproject.model.User;
import com.example.springbootproject.repo.UserRepo;
import com.example.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepo.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(Long id) {
        return userRepo.findById(id)
                .map(this::convertToDto)
                .orElse(null);
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = convertToEntity(userDto);
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void updateUser(UserDto userDto) {
        // Assuming the ID is set in the DTO
        User user = convertToEntity(userDto);
        userRepo.save(user);
    }

    private UserDto convertToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        dto.setAddress(user.getAddress());
        dto.setPhone(user.getPhone());
        return dto;
    }

    private User convertToEntity(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setAge(dto.getAge());
        user.setAddress(dto.getAddress());
        user.setPhone(dto.getPhone());
        return user;
    }
}
