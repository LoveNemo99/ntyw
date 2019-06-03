package com.tinz.ntyw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Port;
import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.service.PortService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/port")
public class PortController {

	private Response response = new Response();
	@Autowired
	PortService mService;
	@Autowired
    private TokenUtil tokenUtil;

    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> query(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		Port result = mService.queryById(id);
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
    
    @RequestMapping(value = "/queryentp/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> tree(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		List<Port> result = mService.queryByEntpId(id);
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
    
    @RequestMapping(value = "/queryentptype/{id}/{typeId}", method = RequestMethod.GET)
    public ResponseEntity<Response> qqueryByEntpAndType(@PathVariable Integer id,@PathVariable Integer typeId)
    {
    	response = new Response();
    	try {
    		List<Port> result = mService.queryByEntpIdType(id,typeId);
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
    
    @RequestMapping(value = "/querytypes/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> types(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		List<String> result = mService.queryPortTypesByEntpId(id);
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
