package com.alex.demo.springtest.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alex.demo.springtest.entity.User;
import com.alex.demo.springtest.mapper.UserMapper;
import com.alex.demo.springtest.vo.UserVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 核心服务-用户表 服务实现类
 * </p>
 *
 * @author Ht
 * @since 2019-03-07
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

	/**
	 * 用户登录验证.
	 * 
	 * @param loginName
	 * @param password
	 * @return
	 */
	public UserVO login(String loginName, String password) {
		if (null != loginName && 0 < loginName.length() && null != password && 0 < password.length()) {
			User user = this.findByLoginName(loginName);
			if (null != user) {
				if (user.getPassword().equals(password)) {
					// 密码一致
					UserVO userVO = new UserVO();
					BeanUtils.copyProperties(user, userVO);
					return userVO;
				}
			}
		}
		return null;
	}

	public User findByUserName(String userName) {
		return baseMapper.findByUserName(userName);
	}

	public User findByLoginName(String loginName) {
		return baseMapper.findByLoginName(loginName);
	}

}
