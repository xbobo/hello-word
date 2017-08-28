package com.xiaobo.cn.common.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.common.entity.SysLogEntity;

/**
 * 系统日志 
 *
 */
@MapperScan
public interface SysLogMapper extends BaseMapper<SysLogEntity> {

	int batchRemoveAll();
	
}
