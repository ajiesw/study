package com.kuer.study.spring.mapper.impl;

import com.kuer.study.spring.mapper.SpringUserMapper;
import com.kuer.study.spring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author kuer
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements SpringUserMapper {
    @Override
    public List<User> queryList() {
        return getSqlSession().getMapper(SpringUserMapper.class).queryList();
    }

    @Override
    public void addUser(User user) {
        getSqlSession().getMapper(SpringUserMapper.class).addUser(user);
        deleteUser(new User(){{setId(4);}});
    }

    @Override
    public void updateUser(User user) {
        getSqlSession().getMapper(SpringUserMapper.class).updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        getSqlSession().getMapper(SpringUserMapper.class).deleteUser(user);
    }
}
