import com.kuer.study.mapper.UserMapper;
import com.kuer.study.pojo.User;
import com.kuer.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MapperTest {
    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2L);
        System.out.println(user);
        System.out.println("==================");
        User user1 = mapper.getUserById(2L);
        System.out.println(user1);
        System.out.println(user.equals(user1));
        // 执行两次查询实际mybatis只查了一次库
        // 在一个session中使用了缓存
        sqlSession.close();
    }
    @Test
    public void test02(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2L);
        System.out.println(user);
        System.out.println("==================");
        // 对数据库进行了操作
        mapper.updateUser(new User(){{setId(4L);setName("wkj");setPassword("qwer");}});
        System.out.println("==================");
        User user1 = mapper.getUserById(2L);
        System.out.println(user1);
        System.out.println(user.equals(user1));
        // 执行两次查询实际mybatis只查了一次库
        // 在一个session中使用了缓存
        sqlSession.close();
    }
    @Test
    public void test03(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2L);
        System.out.println(user);
        System.out.println("==================");
        // 手动清理缓存
        sqlSession.clearCache();
        User user1 = mapper.getUserById(2L);
        System.out.println(user1);
        System.out.println(user.equals(user1));
        sqlSession.close();
    }

    /**
     * 测试二级缓存
     */
    @Test
    public void test04() throws InterruptedException {
        SqlSession sqlSession1 = MyBatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.getUserById(2L);
        System.out.println(user1);
        // 需要先关闭session1
        // 才会将一级缓存存放至二级缓存
        sqlSession1.close();
        System.out.println("==================");
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUserById(2L);
        System.out.println(user2);
        System.out.println("==================");
        System.out.println(user1.equals(user2));
        User user3 = mapper2.getUserById(1L);
        System.out.println(user3);
        sqlSession2.close();
    }
}
