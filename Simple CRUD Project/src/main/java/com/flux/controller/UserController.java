package com.flux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flux.dao.UserDAO;
import com.flux.model.UserTable;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(UserTable userTable) {
		userDao.save(userTable);
		return "home.jsp";
	}
	
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("showUser.jsp");
		UserTable userTable = userDao.findById(id).orElse(null);
		if(userTable == null) {
			mav.addObject("message","User didn't exist");
		}else {
			mav.addObject(userTable);
		}
		return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("deleteUser.jsp");
		UserTable userTable = userDao.findById(id).orElse(new UserTable());
		userDao.deleteById(id);
		mav.addObject(userTable);
		return mav;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("updateUser.jsp");
		UserTable userTable = userDao.findById(id).orElse(null);
		if(userTable == null) {
			mav.addObject("message","User didn't exist");
		}else {
			userDao.deleteById(id);
			mav.addObject("userTable",userTable);
		}
		return mav;
	}
}





