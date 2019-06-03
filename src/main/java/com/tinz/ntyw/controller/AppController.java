package com.tinz.ntyw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/app")
public class AppController {

	private Response response = new Response();
	@Autowired
    private TokenUtil tokenUtil;
	@Value("${app.version.code}")
    private String versionCode;
	private String downloadUrl = "http://218.91.223.15:31710/download/ntyw.apk";
    
//    @TokenValidate
    @RequestMapping(value = "version", method = RequestMethod.GET)
    public ResponseEntity<Response> version()
    {
    	response = new Response();
    	try {
    		Map<String,String> result = new HashMap<String,String>();
    		result.put("versionCode", versionCode);
    		result.put("downloadUrl", downloadUrl);
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
