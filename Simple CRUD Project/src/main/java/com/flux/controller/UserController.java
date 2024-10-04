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
	
	ModelAndView mav;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("addUser")
	public ModelAndView addUser(UserTable userTable) {
		mav = new ModelAndView("addUser.jsp");
		userDao.save(userTable);
		mav.addObject(userTable);
		return mav;
	}
	
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id) {
		UserTable userTable = userDao.findById(id).orElse(null);
		if(userTable == null) {
			mav = new ModelAndView("userNotExist.jsp");
			mav.addObject("message"," view ");
		}else {
			mav = new ModelAndView("showUser.jsp");
			mav.addObject(userTable);
		}
		return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		UserTable userTable = userDao.findById(id).orElse(null);
		if(userTable == null) {
			mav = new ModelAndView("userNotExist.jsp");
			mav.addObject("message"," delete ");
		}else {
			mav = new ModelAndView("deleteUser.jsp");
			userDao.deleteById(id);
			mav.addObject(userTable);
		}
		return mav;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(@RequestParam int id) {
		UserTable userTable = userDao.findById(id).orElse(null);
		if(userTable == null) {
			mav = new ModelAndView("userNotExist.jsp");
			mav.addObject("message"," update ");
		}else {
			mav = new ModelAndView("updateUser.jsp");
			userDao.deleteById(id);
			mav.addObject(userTable);
		}
		return mav;
	}
}





