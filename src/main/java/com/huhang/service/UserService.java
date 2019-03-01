package com.huhang.service;

import com.huhang.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> quickList();

    public void save(User user);

    void update(User user);

    void delete(int id);

    User findById(Integer id);
}
