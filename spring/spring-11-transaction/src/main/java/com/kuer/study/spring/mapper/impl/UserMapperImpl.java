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
}
