package ru.academy.kata.pp_3_1_1_springboot.service;

import org.springframework.stereotype.Service;
import ru.academy.kata.pp_3_1_1_springboot.model.User;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUsers();
    void add(User user);
    void delete(int id);
    void edit(User user, int id);
    User getById(int id);
}
