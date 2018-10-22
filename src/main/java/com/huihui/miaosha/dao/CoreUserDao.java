package com.huihui.miaosha.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.huihui.miaosha.domain.CoreUser;

@Mapper
public interface CoreUserDao {

	@Select("select * from core_user where userName=#{userName}")
	public CoreUser getCoreUser(@Param("userName")String userName);
}
