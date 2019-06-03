package com.tinz.ntyw.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.CantonDao;
import com.tinz.ntyw.dao.EnterpriseDao;
import com.tinz.ntyw.entity.Canton;
import com.tinz.ntyw.entity.Enterprise;
import com.tinz.ntyw.entity.Tree;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EnterpriseDao mDao;
	@Autowired
	private CantonDao cantonDao;
	@Override
	public List<Tree> getTree(Integer formCantonId,Integer industryId,String entpName,Integer userCantonId) {
		Integer cantonId = null;
		if(formCantonId == null && userCantonId == null) {
			return null;
		}
		else if(formCantonId == null && userCantonId != null) {
			cantonId = userCantonId;
		}
		else {
			cantonId = formCantonId;
		}
		String idsStr = getCantonIds(cantonId);
		if(idsStr == null)
			return null;
		if(entpName != null) {
			entpName = "%" + entpName + "%";
		}
		return mDao.getTree(idsStr,industryId,entpName);
	}
	//根据行政区划id获取该区域范围内的所有区域的id 以(1,2,3)的形式输出
	public String getCantonIds(Integer cantonId) {
		Canton canton = cantonDao.queryById(cantonId);
		if(canton == null || canton.getCode() == null || canton.getCode().equals(""))
			return null;
		List<Integer> ids = cantonDao.queryIdsByCode(canton.getCode()+"%");
		return listToStr(ids);
	}
	//将list<Integer>转成(1,2,3)的形式
	public String listToStr(List<Integer> l) {
		if(l == null || l.size() == 0)
			return null;
		String r = "";
		for(int i=0;i<l.size();i++) {
			if(i==0) {
				r = r + l.get(i);
			}
			else {
				r = r + "," + l.get(i);
			}
		}
		return "("+r+")";
	}
	@Override
	public Enterprise queryById(Integer id) {
		return mDao.queryById(id);
	}
	@Override
	public void check(Integer id) {
		mDao.check(id, "已通过");
	}
	@Override
	public void checkNo(Integer id) {
		mDao.check(id, "未通过");
	}
}
