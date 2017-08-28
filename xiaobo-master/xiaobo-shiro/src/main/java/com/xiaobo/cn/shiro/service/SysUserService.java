package com.xiaobo.cn.shiro.service;

import java.util.Map;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.R;
import com.xiaobo.cn.common.entity.SysUserEntity;

/**
 * 系统用户
 *
 */
public interface SysUserService {

	Page<SysUserEntity> listUser(Map<String, Object> params);
	
	R saveUser(SysUserEntity user);
	
	R getUserById(Long userId);
	
	R updateUser(SysUserEntity user);
	
	R batchRemove(Long[] id);
	
	R listUserPerms(Long userId);
	
	R updatePswdByUser(SysUserEntity user);
	
	R updateUserEnable(Long[] id);
	
	R updateUserDisable(Long[] id);
	
	R updatePswd(SysUserEntity user);
	
}
