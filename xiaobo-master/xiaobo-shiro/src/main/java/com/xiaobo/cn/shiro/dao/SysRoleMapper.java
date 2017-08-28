package com.xiaobo.cn.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 */
@MapperScan
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {
	
	List<String> listUserRoles(Long userId);
	
}
