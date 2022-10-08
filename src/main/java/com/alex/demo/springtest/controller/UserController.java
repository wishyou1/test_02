package com.alex.demo.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alex.demo.springtest.service.UserService;
import com.alex.demo.springtest.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value = "用户相关", tags = "用户相关")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ApiOperation(value = "用户登录", notes = "用户登录,传入参数有：username和password")
	public UserVO getUserRoles(String username, String password) {
		UserVO userVO = userService.login(username, password);
		if (null != userVO) {
			System.out.println("登录验证通过");
		} else {
			System.out.println("登录验证不通过,Null返回");
		}
		return userVO;
	}
}
