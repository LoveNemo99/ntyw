package com.tinz.ntyw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.entity.Tree;
import com.tinz.ntyw.service.IndustryService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/indsutry")
public class IndustryController {

	private Response response = new Response();
	@Autowired
	IndustryService mService;
	@Autowired
    private TokenUtil tokenUtil;
    
//    @TokenValidate
    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    public ResponseEntity<Response> tree()
    {
    	response = new Response();
    	try {
    		List<Tree> result = mService.getTree();
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
