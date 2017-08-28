package com.xiaobo.cn.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.common.entity.SysUserEntity;

/**
 * 系统用户dao
 *
 */
@MapperScan
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

	SysUserEntity getByUserName(String username);
	
	List<Long> listAllMenuId(Long userId);
	
	int updatePswdByUser(Query query);
	
	int updateUserStatus(Query query);
	
	int updatePswd(SysUserEntity user);
	
}
