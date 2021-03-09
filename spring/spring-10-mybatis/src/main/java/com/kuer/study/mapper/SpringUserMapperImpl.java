package com.kuer.study.mapper;

import com.kuer.study.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author kuer
 */
public class SpringUserMapperImpl implements SpringUserMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getList(User user) {
        SpringUserMapper mapper = sqlSession.getMapper(SpringUserMapper.class);
        return mapper.getList(new User());
    }
}
