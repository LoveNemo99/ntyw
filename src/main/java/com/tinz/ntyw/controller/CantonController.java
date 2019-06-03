package com.tinz.ntyw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.entity.Tree;
import com.tinz.ntyw.service.CantonService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/canton")
public class CantonController {

	private Response response = new Response();
	@Autowired
	CantonService mService;
	@Autowired
    private TokenUtil tokenUtil;
    
//    @TokenValidate
    @RequestMapping(value = "/tree/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> tree(@PathVariable Integer id)
    {
    	response = new Response();
    	try {
    		List<Tree> result = mService.getTree(id);
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
