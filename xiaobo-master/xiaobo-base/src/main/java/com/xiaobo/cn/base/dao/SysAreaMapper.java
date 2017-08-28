package com.xiaobo.cn.base.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaobo.cn.base.entity.SysAreaEntity;
import com.xiaobo.cn.common.dao.BaseMapper;
import com.xiaobo.cn.common.entity.Query;

/**
 * 行政区域
 *
 */
@MapperScan
public interface SysAreaMapper extends BaseMapper<SysAreaEntity> {

	List<SysAreaEntity> listAreaByParentCode(Query query);
	
}
