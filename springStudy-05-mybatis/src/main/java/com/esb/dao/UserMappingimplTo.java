package com.esb.dao;

import com.esb.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-17 17:17
 **/
@Component
public class UserMappingimplTo extends SqlSessionDaoSupport {
    @Resource(name = "sqlSessionFactory")
    public void UserMappingimplTo(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    public List<User> getUserDaoList() {
        return getSqlSessionTemplate().selectList("com.esb.dao.UserMapping.getUserDaoList",null);
    }
}
