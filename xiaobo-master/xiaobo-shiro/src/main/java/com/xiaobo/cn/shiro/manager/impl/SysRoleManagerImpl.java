package com.xiaobo.cn.shiro.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.shiro.dao.SysRoleMapper;
import com.xiaobo.cn.shiro.dao.SysRoleMenuMapper;
import com.xiaobo.cn.shiro.dao.SysUserRoleMapper;
import com.xiaobo.cn.shiro.entity.SysRoleEntity;
import com.xiaobo.cn.shiro.manager.SysRoleManager;

/**
 * 系统角色
 *
 */
@Component("sysRoleManager")
public class SysRoleManagerImpl implements SysRoleManager {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	
	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public List<SysRoleEntity> listRole(Page<SysRoleEntity> page, Query search) {
		return sysRoleMapper.listForPage(page, search);
	}

	@Override
	public int saveRole(SysRoleEntity role) {
		return sysRoleMapper.save(role);
	}

	@Override
	public SysRoleEntity getRoleById(Long id) {
		SysRoleEntity role = sysRoleMapper.getObjectById(id);
		List<Long> menuId = sysRoleMenuMapper.listMenuId(id);
		role.setMenuIdList(menuId);
		return role;
	}

	@Override
	public int updateRole(SysRoleEntity role) {
		return sysRoleMapper.update(role);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = sysRoleMapper.batchRemove(id);
		sysUserRoleMapper.batchRemoveByRoleId(id);
		sysRoleMenuMapper.batchRemoveByRoleId(id);
		return count;
	}

	@Override
	public List<SysRoleEntity> listRole() {
		return sysRoleMapper.list();
	}

	@Override
	public int updateRoleAuthorization(SysRoleEntity role) {
		Long roleId = role.getRoleId();
		sysRoleMenuMapper.remove(role.getRoleId());
		Query query = new Query();
		query.put("roleId", roleId);
		query.put("menuIdList", role.getMenuIdList());
		int count = sysRoleMenuMapper.save(query);
		return count;
	}
	
}
