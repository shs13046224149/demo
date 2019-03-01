package com.huhang.dao;

import com.huhang.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> queryUserList();

    public void save(User user);

    void update(User user);

    void delete(int id);

    User findById(Integer id);
}
