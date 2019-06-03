package com.tinz.ntyw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ntyw.entity.Factor;

public interface FactorDao {
//	Factor queryById(@Param("id") Integer id);
	List<Factor> queryAll();
	List<Factor> queryByTypeId(@Param("id") Integer id);
//	Integer count();
}
