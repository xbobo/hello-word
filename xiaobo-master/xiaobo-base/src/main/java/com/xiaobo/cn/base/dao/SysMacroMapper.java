package com.xiaobo.cn.base.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.base.entity.SysMacroEntity;
import com.xiaobo.cn.common.dao.BaseMapper;

/**
 * 通用字典
 *
 */
@MapperScan
public interface SysMacroMapper extends BaseMapper<SysMacroEntity> {

	List<SysMacroEntity> listNotMacro();
	
}
