package com.xiaobo.cn.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.shiro.entity.SysMenuEntity;

/**
 * 系统菜单dao
 *
 */
@MapperScan
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {
	
	List<SysMenuEntity> listParentId(Long parentId);
	
	List<SysMenuEntity> listNotButton();
	
	List<String> listUserPerms(Long userId);

}
