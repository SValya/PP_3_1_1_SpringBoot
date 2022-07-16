package com.example.PP_3_1_1_SpringBoot.service;



import com.example.PP_3_1_1_SpringBoot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void add(User user);

    void remove(Long id);

    void edit(User user);

    User getById(Long id);

}
