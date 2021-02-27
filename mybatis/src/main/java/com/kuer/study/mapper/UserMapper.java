package com.kuer.study.mapper;

import com.kuer.study.pojo.User;

import java.util.List;

/**
 * @author kuer
 */
public interface UserMapper {
    /**
     * get
     * @return
     */
    List<User> getUserList();

    /**
     * id 查询
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 插入用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 更新
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除
     * @param id
     */
    void deleteUserById(Long id);
}
