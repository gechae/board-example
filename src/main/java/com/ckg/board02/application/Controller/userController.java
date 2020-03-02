package com.ckg.board02.application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ckg.board02.application.Service.Query;

@RestController
public class userController {

	@Autowired
	private Query userList;
	
//	@RequestMapping(value="/userlist", method = RequestMethod.GET)
//	public List userlist() {
//		
//		System.out.println("Controller Start");
//		return userList.userlist();
//	}
}
