package com.tinz.ntyw.service;

import java.util.List;

import com.tinz.ntyw.entity.Port;

public interface PortService {
	Port queryById(Integer id);
	List<Port> queryByEntpId(Integer id);
	List<Port> queryByEntpIdType(Integer id,Integer typeId);
	List<String> queryPortTypesByEntpId(Integer id);
	void check(Integer id);
	void checkNo(Integer id);
}
