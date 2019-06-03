package com.tinz.ntyw.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tinz.ntyw.entity.Canton;
import com.tinz.ntyw.entity.Tree;

public interface CantonDao {
	Canton queryById(@Param("id") Integer id);//通过个人信息中的行政区划id找出区划code
//	List<Canton> queryAll(@Param("offset") Integer offset, @Param("limit") Integer limit);
//	void add(Canton m);
//	void update(Canton m);
//	void delete(Integer id);
//	Integer checkCodeDuplicate(Canton m);
//	Integer checkNameDuplicate(Canton m);
//	Integer count();
	List<Tree> getTree(@Param("ids") String ids);//(1,2,3)
	List<Integer> queryIdsByCode(String param);//根据行政区划code找出符合要求的id
}
