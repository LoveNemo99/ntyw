package com.tinz.ntyw.service;

import java.util.List;

import com.tinz.ntyw.entity.User;
import com.tinz.ntyw.entity.UserInfo;

public interface UserService {

	List<User> getList();

	UserInfo login(String username, String password);

	User getUserByUsername(String username);

	UserInfo getUserInfoByUsername(String username);
}
