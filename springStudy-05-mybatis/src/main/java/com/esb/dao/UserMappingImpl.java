package com.esb.dao;

import com.esb.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-17 16:45
 **/
@Component
public class UserMappingImpl implements UserMapping {

    //我们所有的操作，都使用sqlsession来执行，在原来，现在都使用SqlSessionTemplate

    @Autowired
    private SqlSessionTemplate sqlSession;
    @Override
    public List<User> getUserDaoList() {
        sqlSession.select("com.esb.dao.UserMapping.getUserDaoList",null);
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        return  mapper.getUserDaoList();
    }
    public List<User> getUserDaoList2() {
        return sqlSession.selectList("com.esb.dao.UserMapping.getUserDaoList",null);
    }

    @Override
    public User getUserDaoById(int id) {
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        return  mapper.getUserDaoById(2);
    }

    @Override
    public int insertUser(User user) {
        User user1 =new User(4,"hahaa","123");
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        mapper.insertUser(user1);
        return 1/0;
    }

    @Override
    public int updateUser(User user) {
        User user1 =new User(4,"hahaa修改","123");
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        return  mapper.updateUser(user1);
    }

    @Override
    public int deleteUserById(int id) {
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        return  mapper.deleteUserById(4);
    }

    @Override
    public int deleteUser(User user) {
        User user1 =new User(4,"hahaa修改","123");
        UserMapping mapper = sqlSession.getMapper(UserMapping.class);
        return  mapper.deleteUser(user1);
    }
}
