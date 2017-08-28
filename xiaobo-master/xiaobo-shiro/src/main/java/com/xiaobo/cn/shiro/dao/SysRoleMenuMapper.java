package com.xiaobo.cn.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.shiro.entity.SysRoleMenuEntity;

/**
 * 系统角色与菜单关系
 *
 */
@MapperScan
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenuEntity> {

	int batchRemoveByMenuId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
	List<Long> listMenuId(Long id);
	
}
