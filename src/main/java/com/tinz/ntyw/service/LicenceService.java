package com.tinz.ntyw.service;

import java.util.List;
import java.util.Map;

public interface LicenceService {

	List<Map<String, Object>> queryByType(Integer entpId, Integer portId, Integer typeId);

	void check(Integer id);

	void checkNo(Integer id);
}
