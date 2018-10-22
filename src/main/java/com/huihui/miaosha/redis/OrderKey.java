package com.huihui.miaosha.redis;

public class OrderKey extends BasePrefix {

	public OrderKey(int expireSeconds, String getPrefix) {
		super(expireSeconds, getPrefix);
	}

}
