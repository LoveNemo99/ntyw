package com.tinz.ntyw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.CriteriaLicence;
import com.tinz.ntyw.entity.Enterprise;
import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.service.LicenceService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/licence")
public class LicenceController {

	private Response response = new Response();
	@Autowired
	LicenceService mService;
	@Autowired
    private TokenUtil tokenUtil;
    
//    @TokenValidate
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseEntity<Response> tree(@RequestBody CriteriaLicence c)
    {
    	response = new Response();
    	try {
    		List<Map<String, Object>> result = mService.queryByType(c.getEntpId(),c.getPortId(),c.getTypeId());
    		if(result != null && result.size() !=0) {
    			response.setMsg(Response.OK,"成功",result);
    			return ResponseEntity.ok(response);
    		}
    		else {
    			response.setMsg(Response.OK,"成功",result);
    			return ResponseEntity.ok(response);
    		}
    	}
    	catch(Exception e){
    		e.printStackTrace();
			response = new Response();
    		response.setMsg(Response.FAIL, "失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
    	}
    }
    @RequestMapping(value = "/check/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> check(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		mService.check(id);
			response.setMsg(Response.OK,"成功","成功");
	        return ResponseEntity.ok(response);
    	}
    	catch(Exception e){
    		e.printStackTrace();
			response = new Response();
    		response.setMsg(Response.FAIL, "失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
    	}
    }
    @RequestMapping(value = "/checkno/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> checkNo(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		mService.checkNo(id);
			response.setMsg(Response.OK,"成功","成功");
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
