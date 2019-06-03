package com.tinz.ntyw.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.FactorDao;
import com.tinz.ntyw.dao.LicenceDao;
import com.tinz.ntyw.entity.Factor;

@Service
public class LicenceServiceImpl implements LicenceService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private LicenceDao mDao;
	@Autowired
	private FactorDao factorDao;
	@Override
	public List<Map<String, Object>> queryByType(Integer entpId, Integer portId,Integer typeId) {
		List<Factor> factors = factorDao.queryAll();
		List<Map<String, Object>> result = mDao.queryRecord(entpId, portId, null, null, factors);
		if(result != null && result.size() !=0) {
			result.get(0).put("licenceList", mDao.queryFactorLicence(typeId, (Integer) result.get(0).get("id")));
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
