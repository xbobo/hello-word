package com.xiaobo.cn.common.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaobo.cn.common.entity.Page;
import com.xiaobo.cn.common.entity.Query;
import com.xiaobo.cn.common.entity.R;
import com.xiaobo.cn.common.entity.SysLogEntity;
import com.xiaobo.cn.common.manager.SysLogManager;
import com.xiaobo.cn.common.service.SysLogService;
import com.xiaobo.cn.common.utils.CommonUtils;

/**
 * 系统日志
 *
 */
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	private SysLogManager sysLogManager;
	
	@Override
	public Page<SysLogEntity> listLog(Map<String, Object> params) {
		Query query = new Query(params);
		Page<SysLogEntity> page = new Page<>(query);
		sysLogManager.listLog(page, query);
		return page;
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = sysLogManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

	@Override
	public R batchRemoveAll() {
		int count = sysLogManager.batchRemoveAll();
		return CommonUtils.msg(count);
	}

}
