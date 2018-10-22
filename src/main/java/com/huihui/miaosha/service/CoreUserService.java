package com.huihui.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihui.miaosha.dao.CoreUserDao;
import com.huihui.miaosha.domain.CoreUser;

@Service
public class CoreUserService {

	@Autowired
	CoreUserDao coreUserDao;

	public CoreUser getCoreUser(String userName) {
		return coreUserDao.getCoreUser(userName);
	}
}
