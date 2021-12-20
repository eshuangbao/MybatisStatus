package com.esb.dao;


import com.esb.pojo.User;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-06 10:23
 **/
public interface UserMapping {
    List<User> getUserDaoList();
    User getUserDaoById(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);
    int deleteUser(User user);
}
