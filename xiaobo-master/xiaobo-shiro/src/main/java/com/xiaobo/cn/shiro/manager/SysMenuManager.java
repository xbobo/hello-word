package com.xiaobo.cn.shiro.manager;

import java.util.List;

import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.shiro.entity.SysMenuEntity;

/**
 * 系统菜单
 *
 */
public interface SysMenuManager {
	
	List<SysMenuEntity> listUserMenu(Long userId);
	
	List<SysMenuEntity> listParentId(Long parentId, List<Long> menuIdList);
	
	List<SysMenuEntity> listMenu(Query search);
	
	List<SysMenuEntity> listNotButton();
	
	int saveMenu(SysMenuEntity menu);

	SysMenuEntity getMenuById(Long id);
	
	int updateMenu(SysMenuEntity menu);
	
	int batchRemove(Long[] id);
	
}
