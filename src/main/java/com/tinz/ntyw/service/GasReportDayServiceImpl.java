package com.tinz.ntyw.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinz.ntyw.dao.FactorDao;
import com.tinz.ntyw.dao.GasReportDayDao;
import com.tinz.ntyw.entity.Factor;

@Service
public class GasReportDayServiceImpl implements GasReportDayService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private GasReportDayDao mDao;
	@Autowired
	private FactorDao factorDao;
	@Override
	public List<Map<String, Object>> queryByType(Integer entpId, Integer portId, Date startTime, Date endTime) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(startTime == null) {
			Date now = new Date();
			startTime = new Date(now.getTime()-30*24*60*60*1000l);
		}
		if(endTime == null) {
			Date now = new Date();
			endTime = now;
		}
		if(startTime == null || endTime == null) {
			return null;
		}
		List<Factor> factors = factorDao.queryByTypeId(1);//废气
		return mDao.queryRecord(entpId, portId, startTime, endTime, factors);
	}
}
