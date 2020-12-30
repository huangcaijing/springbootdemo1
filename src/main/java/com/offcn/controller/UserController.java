package com.offcn.controller;

import com.offcn.po.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

   @PostMapping("/")
    public String save(User user){
        userService.save(user);
        return "success";
    }
    @PutMapping("/")
    public String uqdate(User user){
        userService.update(user);
        return "success";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "success";
    }
    @GetMapping("/{id}")
    public User getOne(@PathVariable("id")int id){
        return userService.getOne(id);
    }
    @GetMapping("/")
    public List<User> getAll(){
        return userService.getAll();
    }
}
