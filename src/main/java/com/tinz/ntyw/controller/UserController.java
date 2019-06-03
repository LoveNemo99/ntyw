package com.tinz.ntyw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ntyw.entity.Response;
import com.tinz.ntyw.entity.User;
import com.tinz.ntyw.entity.UserInfo;
import com.tinz.ntyw.service.UserService;
import com.tinz.ntyw.token.TokenUtil;
 
@Controller
@RequestMapping(value = "/api/user")
public class UserController {

	private Response response = new Response();
	@Autowired
	UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Response> login(@RequestBody User user)
    {
    	response = new Response();
    	UserInfo u = userService.login(user.getUsername(), user.getPassword());
    	if (u == null)
        {
            response.setMsg(Response.FAIL,"验证失败，请检查账号密码",u);
            return ResponseEntity.ok(response);
        }
//    	UserInfo info = userService.getUserInfoByUsername(u.getUsername());
//    	u.setRole(info.getRole());
//    	u.setPsId(info.getPsId());
        response.setMsg(Response.OK,"验证成功",u);
        return ResponseEntity.ok(response);
    }
    
//    @TokenValidate
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ResponseEntity<Response> info(HttpServletRequest request)
    {
    	response = new Response();
    	String username = tokenUtil.getUsernameFromRequest(request);
    	if(username==null) {
    		response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
    	}
		UserInfo u = userService.getUserInfoByUsername(username);
    	System.out.println("getUserInfo"+u);
    	if (u == null)
        {
            response.setMsg(Response.FAIL,"获取失败",u);
            return ResponseEntity.ok(response);
        }
        response.setMsg(Response.OK,"获取成功",u);
        return ResponseEntity.ok(response);
    }

}
