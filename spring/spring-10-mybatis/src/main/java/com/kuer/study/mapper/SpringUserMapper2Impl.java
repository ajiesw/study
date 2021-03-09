package com.kuer.study.mapper;

import com.kuer.study.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author kuer
 */
public class SpringUserMapper2Impl extends SqlSessionDaoSupport implements SpringUserMapper{


    @Override
    public List<User> getList(User user) {
        return getSqlSession().getMapper(SpringUserMapper.class).getList(new User());
    }
}
