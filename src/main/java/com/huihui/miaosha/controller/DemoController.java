package com.huihui.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huihui.miaosha.domain.CoreUser;
import com.huihui.miaosha.redis.RedisService;
import com.huihui.miaosha.redis.User;
import com.huihui.miaosha.redis.UserKey;
import com.huihui.miaosha.result.CodeMsg;
import com.huihui.miaosha.result.Result;
import com.huihui.miaosha.service.CoreUserService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	CoreUserService coreUserService;
	@Autowired
	RedisService redisService;


	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "hello world!";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public Result<String> hellword() {
		return Result.success("data");
	}

	@RequestMapping("/hellerror")
	@ResponseBody
	public Result<String> hellerror() {
		return Result.error(CodeMsg.SERVICEERROR);
	}

	@RequestMapping("/thymeleaf")
	@ResponseBody
	public String thymeleaf(Model model) {
		model.addAttribute("name", "终于好了，小伙子");
		return "hello";
	}

	@RequestMapping("/druid")
	@ResponseBody
	public Result<CoreUser> getUserInfo() {
		CoreUser coreUser=coreUserService.getCoreUser("13817381324");
		return Result.success(coreUser);
	}
	
	@RequestMapping("/redis/get")
	@ResponseBody
	public Result<User> redisGet() {
		User user=redisService.get(UserKey.getById,""+1, User.class);
		return Result.success(user);
	}
	
	@RequestMapping("/redis/set")
	@ResponseBody
	public Result<Boolean>  redisSet() {
		User user=new User();
		user.setId(1);
		user.setUsername("12121");
		redisService.set(UserKey.getById,""+1, user);
		return Result.success(true);
	}




}
