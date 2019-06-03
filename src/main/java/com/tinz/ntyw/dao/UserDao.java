package com.tinz.ntyw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ntyw.entity.User;
import com.tinz.ntyw.entity.UserInfo;

public interface UserDao {
	Integer login(@Param("username") String username,@Param("password") String password);
	User loginUser(@Param("username") String username,@Param("password") String password);
	UserInfo queryById(Integer id);

	List<User> queryAll(@Param("offset") Integer offset, @Param("limit") Integer limit);
	User getUserByUsername(@Param("username") String username);
	UserInfo getUserInfoByUsername(@Param("username") String username);
}
