package com.tinz.ntyw.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.tinz.ntyw.entity.Factor;

public interface LicenceDao {
	List<Map<String,Object>> queryAll();
	List<Map<String,Object>> queryRecord(@Param("entpId") Integer entpId,@Param("portId") Integer portId,
			@Param("startTime") Date startTime, @Param("endTime") Date endTime,@Param("factors") List<Factor> factors);
//	Integer count(@Param("psCode") String psCode,@Param("portCode") String portCode,
//			@Param("startTime") Date startTime, @Param("endTime") Date endTime);
	List<Map<String,Object>> queryFactorLicence(@Param("typeId") Integer typeId,@Param("mainId") Integer mainId);
	void check(@Param("id") Integer id,@Param("checked") String checked);
}