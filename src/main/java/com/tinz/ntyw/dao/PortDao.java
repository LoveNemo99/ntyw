package com.tinz.ntyw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ntyw.entity.Port;
import com.tinz.ntyw.entity.Tree;

public interface PortDao {
	Port queryById(@Param("id") Integer id);
	List<Port> queryByEntpId(@Param("id") Integer id);
	List<Port> queryByEntpIdType(@Param("id") Integer id,@Param("typeId") Integer typeId);
//	List<Port> queryAll(
//			@Param("cantonIds") String cantonIds,
//			@Param("indusCatg") String indusCatg,
//			@Param("offset") Integer offset,
//			@Param("limit") Integer limit);
	void add(Port m);
	void update(Port m);
	void delete(Integer id);
	Integer checkCodeDuplicate(Port m);
	Integer checkNameDuplicate(Port m);
	//List<Tree> getTree(@Param("cantonIds") String cantonIds,@Param("industryId") Integer industryId,@Param("entpParam") String entpParam);
	Integer count();
	void check(@Param("id") Integer id,@Param("checked") String checked);
}
