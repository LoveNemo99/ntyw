package com.tinz.ntyw.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GasReportMonthService {
	List<Map<String,Object>> queryByType(Integer entpId, Integer portId, Date startTime, Date endTime);
}
