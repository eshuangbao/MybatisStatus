package com.esb.dao;

import com.esb.pojo.User;
import com.esb.utild.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-06 10:33
 **/
public class UserTest {
    @Test
    public void  test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
           /* UserDao mapper = (UserDao) sqlSession.getMapper(UserDao.class);
            List<User> userDaoList = mapper.getUserDaoList();
            User userDaoById = mapper.getUserDaoById(1);
            for (User u :userDaoList) {
                System.out.println(u.toString());
            }
            System.out.println(userDaoById.toString());
            System.out.println("-----------------------------");*/
            List<User> objects = sqlSession.selectList("com.esb.dao.UserDao.getUserDaoList");
            for (User u :objects) {
                System.out.println(u.toString());
            }
            List<User> objects2 = sqlSession.selectList("com.esb.dao.UserDao.getUserDaoList");
            User o = sqlSession.selectOne("com.esb.dao.UserDao.getUserDaoById", 2);
            System.out.println(o.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }

    }
    @Test
    public  void  insertest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao mapper = (UserDao) sqlSession.getMapper(UserDao.class);
            User hh = new User(4, "hh", "123");
            int i = mapper.insertUser(hh);
            System.out.println("插入完毕！"+i);
            //还没有真正插入到数据表中，因为所有的增删改都有事务
            sqlSession.commit();
            System.out.println("提交事务完毕！");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public  void updatetest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao mapper = (UserDao) sqlSession.getMapper(UserDao.class);
            User hh = new User(4, "hh修改后", "123");
            int i = mapper.updateUser(hh);
            System.out.println("修改完毕！"+i);
            //还没有真正插入到数据表中，因为所有的增删改都有事务
            sqlSession.commit();
            System.out.println("提交事务完毕！");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void  deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            mapper.deleteUserById(4);
            sqlSession.commit();
            System.out.println("int参数删除成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void deleteUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setId(4);
            int i = mapper.deleteUser(user);
            sqlSession.commit();
            System.out.println("用户参数删除成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
}
