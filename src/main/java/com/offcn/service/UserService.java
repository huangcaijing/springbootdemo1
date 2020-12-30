package com.offcn.service;

import com.offcn.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    void delete(int id);

    User getOne(int id);

    List<User> getAll();
}
