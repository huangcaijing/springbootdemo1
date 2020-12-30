package com.offcn.dao;

import com.offcn.po.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserDao {
    @Insert("INSERT INTO user(name,age) VALUES(#{name},#{age})")
    void save(User user);
    @Update("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
    void update(User user);
    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(int id);
    @Select("SELECT id,name,age FROM user WHERE id = #{id}")
    User getOne(int id);
    @Select("SELECT id,name,age FROM user")
    List<User> getAll();
}
