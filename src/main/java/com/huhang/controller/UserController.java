package com.huhang.controller;

import com.huhang.pojo.User;
import com.huhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询
    @RequestMapping(method = RequestMethod.GET)
    public List<User> quick() {
       return userService.quickList();
    }

    //根据id查询
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable String id) {
        Integer newId = Integer.parseInt(id);
        return userService.findById(newId);
    }

    //添加
    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user) {
        userService.save(user);
        return "添加成功！";
    }

    //修改
    @RequestMapping(method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        userService.update(user);
        return "修改成功！";
    }

    //删除
    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        int newId = Integer.parseInt(id);
        userService.delete(newId);
        return "删除成功！";
    }

}
