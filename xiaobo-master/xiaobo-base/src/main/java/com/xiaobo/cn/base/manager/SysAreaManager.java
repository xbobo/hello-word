package com.xiaobo.cn.base.manager;

import java.util.List;

import com.xiaobo.cn.base.entity.SysAreaEntity;
import com.xiaobo.cn.common.entity.Query;

/**
 * 行政区域
 *
 */
public interface SysAreaManager {

	List<SysAreaEntity> listAreaByParentCode(Query query);
	
	int saveArea(SysAreaEntity area);
	
	SysAreaEntity getAreaById(Long areaId);
	
	int updateArea(SysAreaEntity area);
	
	int batchRemoveArea(Long[] id);
	
}
