package com.tinz.ntyw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.CriteriaData;
import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.service.GasReportHourService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/gas/hour")
public class GasReportHourController {

	private Response response = new Response();
	@Autowired
	GasReportHourService mService;
	@Autowired
    private TokenUtil tokenUtil;
    
//    @TokenValidate
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseEntity<Response> tree(@RequestBody CriteriaData c)
    {
    	response = new Response();
    	try {
    		List<Map<String, Object>> result = mService.queryByType(c.getEntpId(),c.getPortId(),c.getStartTime(),c.getEndTime());
			response.setMsg(Response.OK,"成功",result);
	        return ResponseEntity.ok(response);
    	}
    	catch(Exception e){
    		e.printStackTrace();
			response = new Response();
    		response.setMsg(Response.FAIL, "失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
    	}
    }

}
