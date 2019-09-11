package com.github.mybatis.dao;

import com.github.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据用户名和id查询用户
     * @param name
     * @param role
     * @return
     */
    List<User> queryUserByUserNameAndUserRole(@Param("userName") String name,@Param("userRole") Integer role ,@Param("gerder") Integer gender);

    /**
     * 根据用户id更改用户名称
     * @param user
     * @return
     */
    int updateUserByUserId(User user);

    /**
     * 根据id查询用户列表
     * @param list
     * @return
     */
    List<User> queryUserByArr(List<Integer> list);
}
