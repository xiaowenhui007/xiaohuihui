package com.huihui.miaosha.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huihui.miaosha.redis.RedisService;
import com.huihui.miaosha.result.CodeMsg;
import com.huihui.miaosha.result.Result;
import com.huihui.miaosha.service.MiaoshaUserService;
import com.huihui.miaosha.vo.LoginVo;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static Logger log=LoggerFactory.getLogger(LoginController.class);
	@Autowired
	MiaoshaUserService miaoshaUserService;
	@Autowired
	RedisService redisService;


	@RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

	@RequestMapping("/do_login")
	@ResponseBody
	public Result<Boolean> doLogin(LoginVo loginVo) {
		log.info(loginVo.toString());
		CodeMsg msg=miaoshaUserService.login(loginVo);
		if(msg.getCode()==0) {
			return Result.success(true);
		}else {
			return Result.error(msg);
		}
	}

}
