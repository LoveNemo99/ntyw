package com.tinz.ntyw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tinz.ntyw.entity.Enterprise;
import com.tinz.ntyw.entity.Tree;

public interface EnterpriseDao {
	Enterprise queryById(@Param("id") Integer id);
	List<Enterprise> queryAll(
			@Param("cantonIds") String cantonIds,
			@Param("indusCatg") String indusCatg,
			@Param("offset") Integer offset,
			@Param("limit") Integer limit);
	void add(Enterprise m);
	void update(Enterprise m);
	void delete(Integer id);
	Integer checkCodeDuplicate(Enterprise m);
	Integer checkNameDuplicate(Enterprise m);
	List<Tree> getTree(@Param("cantonIds") String cantonIds,@Param("industryId") Integer industryId,@Param("entpParam") String entpParam);
	Integer count();
	void check(@Param("id") Integer id,@Param("checked") String checked);
}
