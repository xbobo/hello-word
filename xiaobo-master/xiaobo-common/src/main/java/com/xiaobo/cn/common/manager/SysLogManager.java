package com.xiaobo.cn.common.manager;

import java.util.List;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.common.entity.SysLogEntity;

/**
 * 系统日志
 *
 */
public interface SysLogManager {

	void saveLog(SysLogEntity log);
	
	List<SysLogEntity> listLog(Page<SysLogEntity> page, Query query);
	
	int batchRemove(Long[] id);
	
	int batchRemoveAll();
	
}
