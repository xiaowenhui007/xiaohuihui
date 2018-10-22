package com.huihui.miaosha.redis;

public class UserKey extends BasePrefix{

	public UserKey(String getPrefix) {
		super(getPrefix);
	}

	public static UserKey getById=new UserKey("id");

	public static UserKey getByName=new UserKey("name");

}
