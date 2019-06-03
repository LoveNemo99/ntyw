package com.tinz.ntyw.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.IndustryDao;
import com.tinz.ntyw.entity.Tree;

@Service
public class IndustryServiceImpl implements IndustryService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IndustryDao mDao;
	@Override
	public List<Tree> getTree() {
		return mDao.getTree();
	}
	
}
