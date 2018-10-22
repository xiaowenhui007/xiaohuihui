package com.huihui.miaosha.result;

public class CodeMsg {
	private int code;
	private String msg;

	//通用的异常
	public static CodeMsg SUCCESS=new CodeMsg(0,"SUCCESS");
	public static CodeMsg SERVICEERROR=new CodeMsg(500100,"服务端异常");
	public static CodeMsg USERPHONEEXITE=new CodeMsg(500101,"手机号码不存在");
	public static CodeMsg PASSWORDERROR=new CodeMsg(500101,"密码错误");

	//登录模块500200

	//商品模块500300

	//订单模块500400

	//秒杀模块500500




	private CodeMsg(int code, String msg) {
		this.code=code;
		this.msg=msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
