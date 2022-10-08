package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 核心服务-用户表 Mapper 接口
 * </p>
 *
 * @author Ht
 * @since 2019-03-07
 */
public interface UserMapper extends BaseMapper<User> {
	User findByUserName(String userName);

	User findByLoginName(String loginName);
}
