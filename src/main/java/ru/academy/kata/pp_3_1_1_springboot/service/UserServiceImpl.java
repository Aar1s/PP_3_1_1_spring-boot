package ru.academy.kata.pp_3_1_1_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.academy.kata.pp_3_1_1_springboot.dao.UserDAO;
import ru.academy.kata.pp_3_1_1_springboot.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public void edit(User user, int id) {
        userDAO.edit(user, id);
    }

    @Transactional
    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
