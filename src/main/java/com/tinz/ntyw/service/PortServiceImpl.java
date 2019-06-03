package com.tinz.ntyw.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.CantonDao;
import com.tinz.ntyw.dao.PortDao;
import com.tinz.ntyw.entity.Canton;
import com.tinz.ntyw.entity.Port;

@Service
public class PortServiceImpl implements PortService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PortDao mDao;
	@Autowired
	private CantonDao cantonDao;
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
	public Port queryById(Integer id) {
		return mDao.queryById(id);
	}
	@Override
	public List<Port> queryByEntpId(Integer id) {
		return mDao.queryByEntpId(id);
	}
	@Override
	public List<Port> queryByEntpIdType(Integer id,Integer typeId) {
		return mDao.queryByEntpIdType(id,typeId);
	}
	
	@Override
	public List<String> queryPortTypesByEntpId(Integer id){
		List<String> result = new ArrayList<String>();
		List<Port> ports= mDao.queryByEntpId(id);
		for(Port p:ports) {
			if(!result.contains(p.getType())) {
				result.add(p.getType());
			}
		}
		return result;
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
