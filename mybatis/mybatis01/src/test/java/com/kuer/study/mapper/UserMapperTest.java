package com.kuer.study.mapper;

import com.kuer.study.pojo.User;
import com.kuer.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kuer
 */
public class UserMapperTest {

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
            System.out.println("================");
            // 方式二 旧方法
            List<User> objects = sqlSession.selectList("com.kuer.study.mapper.UserMapper.getUserList");
            objects.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @Test
    public void test02(){
        // 获取sqlSession
        try (SqlSession sqlSession = MyBatisUtils.getSqlSession()) {
            // 方式一 执行Mapper的sql 推荐使用
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1L);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03(){
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.insertUser(new User(){{
                setName("王五");
                setPassword("123wd");
            }});
            // 提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test04(){
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.updateUser(new User(){{
                setId(1L);
                setName("赵六");
                setPassword("123wd");
            }});
            // 提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test05(){
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.deleteUserById(1L);
            // 提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
