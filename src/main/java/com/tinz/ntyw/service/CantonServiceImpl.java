package com.tinz.ntyw.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.CantonDao;
import com.tinz.ntyw.entity.Canton;
import com.tinz.ntyw.entity.Tree;
import com.tinz.ntyw.token.TokenUtil;

@Service
public class CantonServiceImpl implements CantonService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CantonDao mDao;
	@Autowired
	private TokenUtil tokenUtil;
	@Override
	public List<Tree> getTree(Integer userCantonId) {
		if(userCantonId == null)
			return null;
		Canton canton = mDao.queryById(userCantonId);
		if(canton == null || canton.getCode() == null || canton.getCode().equals(""))
			return null;
		List<Integer> ids = mDao.queryIdsByCode(canton.getCode()+"%");
		if(ids == null || ids.size() == 0)
			return null;
		String idsStr = "";
		for(int i=0;i<ids.size();i++) {
			if(i==0) {
				idsStr = ids.get(i)+"";
			}
			else {
				idsStr = idsStr + "," + ids.get(i);
			}
		}
		idsStr = "("+idsStr+")";
		System.out.println(ids.toString());
		return mDao.getTree(idsStr);
	}
	
}
