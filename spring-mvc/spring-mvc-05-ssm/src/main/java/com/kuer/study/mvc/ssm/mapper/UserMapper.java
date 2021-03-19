package com.kuer.study.mvc.ssm.mapper;



import com.kuer.study.mvc.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @author kuer
 */
public interface UserMapper {

    /**
     * getList
     * @param user
     * @return
     */
    List<User> getList(User user);
}
