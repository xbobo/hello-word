package com.xiaobo.cn.shiro.manager;

import java.util.List;
import java.util.Set;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.common.entity.SysUserEntity;

/**
 * 系统用户
 *
 */
public interface SysUserManager {

	SysUserEntity getByUserName(String username);
	
	List<SysUserEntity> listUser(Page<SysUserEntity> page, Query search);
	
	int saveUser(SysUserEntity user);
	
	SysUserEntity getById(Long userId);
	
	int updateUser(SysUserEntity user);
	
	int batchRemove(Long[] id);
	
	Set<String> listUserPerms(Long userId);
	
	Set<String> listUserRoles(Long userId);
	
	int updatePswdByUser(Query query);
	
	int updateUserEnable(Long[] id);
	
	int updateUserDisable(Long[] id);
	
	int updatePswd(SysUserEntity user);
	
	SysUserEntity getUserById(Long userId);
	
}
