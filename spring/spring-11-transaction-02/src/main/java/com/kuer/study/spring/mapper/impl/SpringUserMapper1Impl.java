package com.kuer.study.spring.mapper.impl;

import com.kuer.study.spring.mapper.SpringUserMapper1;
import com.kuer.study.spring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kuer
 */
public class SpringUserMapper1Impl extends SqlSessionDaoSupport implements SpringUserMapper1 {

    @Override
    @Transactional(readOnly = true)
    public List<User> queryList() {
        return getSqlSession().getMapper(SpringUserMapper1.class).queryList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addUser(User user) {
        getSqlSession().getMapper(SpringUserMapper1.class).addUser(user);
        deleteUser(new User(){{setId(2);}});
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void updateUser(User user) {
        getSqlSession().getMapper(SpringUserMapper1.class).updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteUser(User user) {
        getSqlSession().getMapper(SpringUserMapper1.class).deleteUser(user);
    }
}
