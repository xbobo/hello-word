package com.xiaobo.cn.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.shiro.entity.SysUserRoleEntity;

/**
 * 用户与角色关系
 *
 */
@MapperScan
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {

	List<Long> listUserRoleId(Long userId);
	
	int batchRemoveByUserId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
}
