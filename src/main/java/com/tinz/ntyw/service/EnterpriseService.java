package com.tinz.ntyw.service;

import java.util.List;

import com.tinz.ntyw.entity.Enterprise;
import com.tinz.ntyw.entity.Tree;

public interface EnterpriseService {
	List<Tree> getTree(Integer cantonId, Integer industryId, String entpName, Integer userCantonId);
	Enterprise queryById(Integer id);
	void check(Integer id);
	void checkNo(Integer id);
}
