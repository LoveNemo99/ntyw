package com.tinz.ntyw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Criteria;
import com.tinz.ntyw.entity.Enterprise;
import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.entity.Tree;
import com.tinz.ntyw.entity.UserInfo;
import com.tinz.ntyw.service.EnterpriseService;
import com.tinz.ntyw.service.UserService;
import com.tinz.ntyw.token.TokenUtil;
import com.tinz.ntyw.token.TokenValidate;
 
@Controller
@RequestMapping(value = "/api/enterprise")
public class EnterpriseController {

	private Response response = new Response();
	@Autowired
	EnterpriseService mService;
	@Autowired
	UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
    
//    @TokenValidate
    @RequestMapping(value = "/tree", method = RequestMethod.POST)
    public ResponseEntity<Response> tree(@RequestBody Criteria c,HttpServletRequest request)
    {
    	response = new Response();
    	try {
    		if(c.getIndustryId()==0) {
    			c.setIndustryId(null);
    		}
//    		System.out.println("===========================1111");
    		String username = tokenUtil.getUsernameFromRequest(request);
//    		System.out.println("=========================username:"+username);
//    		System.out.println("===========================2222");
			UserInfo u = userService.getUserInfoByUsername(username);
//			System.out.println("===========================3333");
    		List<Tree> result = mService.getTree(c.getCantonId(),c.getIndustryId(),c.getEntpKey(),null);
    		if(result!=null) {
    			for(Tree t:result) {
    				if(u.getUsername().equals(t.getIcon())) {
    					List<Tree> result2 = new ArrayList<Tree>();
    					result2.add(t);
    					response.setMsg(Response.OK,"成功",result2);
    			        return ResponseEntity.ok(response);
    				}
    			}
    		}
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

    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> tree(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		Enterprise result = mService.queryById(id);
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
