package com.kuer.study.mapper;

import com.kuer.study.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kuer
 */
public interface UserMapper {
    /**
     * get
     * @return
     */
    @Select("select * from user")
    List<User> getUserList();
}
