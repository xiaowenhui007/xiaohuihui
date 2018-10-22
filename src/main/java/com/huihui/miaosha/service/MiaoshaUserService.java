package com.huihui.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihui.miaosha.dao.MiaoshaUserDao;
import com.huihui.miaosha.domain.MiaoshaUser;
import com.huihui.miaosha.result.CodeMsg;
import com.huihui.miaosha.vo.LoginVo;

@Service
public class MiaoshaUserService {

	@Autowired
	private MiaoshaUserDao miaoshaUserDao;

	public MiaoshaUser getById(Long id) {
		return  miaoshaUserDao.getById(id);
	}

	public CodeMsg login(LoginVo loginVo) {
		if(loginVo==null) {
			return CodeMsg.SERVICEERROR;
		}
		MiaoshaUser miaoshaUser=getById(Long.parseLong(loginVo.getMobile()));
		if(miaoshaUser==null) {
			return CodeMsg.USERPHONEEXITE;
		}
//		String formPass=MD5Util.formPassToDBPass(loginVo.getPassword(), miaoshaUser.getSalt());
//		if(!formPass.equals(miaoshaUser.getPassword())) {
//			return CodeMsg.PASSWORDERROR;
//		}
		return CodeMsg.SUCCESS;
	}
}
