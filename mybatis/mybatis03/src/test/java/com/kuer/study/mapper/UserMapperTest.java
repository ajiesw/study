package com.kuer.study.mapper;


import com.kuer.study.pojo.User;
import com.kuer.study.utils.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * @author kuer
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void log4jTest(){
        logger.info("info：进入了log4j");
        logger.error("error：进入了log4j");
        logger.debug("debug：进入了log4j");
        logger.warn("warn：进入了log4j");
    }
    @Test
    public void test01(){
        // 获取sqlSession
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            // 方式一 执行Mapper的sql 推荐使用
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testPage(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 3);
        List<User> list = sqlSession.selectList("com.kuer.study.mapper.UserMapper.getUserList", null, rowBounds);
        list.forEach(System.out::println);
        sqlSession.close();
    }
}
