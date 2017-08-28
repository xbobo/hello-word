package com.xiaobo.cn.base.service;

import java.util.List;

import com.xiaobo.cn.base.entity.SysMacroEntity;
import com.xiaobo.cn.common.entity.R;

/**
 * 通用字典
 *
 */
public interface SysMacroService {

	List<SysMacroEntity> listMacro();
	
	List<SysMacroEntity> listNotMacro();
	
	R saveMacro(SysMacroEntity macro);
	
	R getObjectById(Long id);
	
	R updateMacro(SysMacroEntity macro);
	
	R batchRemove(Long[] id);
	
}
