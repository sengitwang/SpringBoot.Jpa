package com.springboot.mybatis.demo.dao;

import com.springboot.mybatis.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sen on 2016/8/17.
 */
@Transactional
public interface UserDao extends JpaRepository<User,Integer> {

}
