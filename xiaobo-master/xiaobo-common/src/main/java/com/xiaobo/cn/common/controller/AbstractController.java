package com.xiaobo.cn.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xiaobo.cn.common.entity.SysUserEntity;
import com.xiaobo.cn.common.utils.ShiroUtils;

/**
 * Controller公共组件
 *
 */
public abstract class AbstractController {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
	
}
