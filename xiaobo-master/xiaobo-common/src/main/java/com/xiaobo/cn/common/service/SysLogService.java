package com.xiaobo.cn.common.service;

import java.util.Map;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.R;
import com.xiaobo.cn.common.entity.SysLogEntity;

/**
 * 系统日志
 *
 */
public interface SysLogService {

	Page<SysLogEntity> listLog(Map<String, Object> params);
	
	R batchRemove(Long[] id);
	
	R batchRemoveAll();
	
}
