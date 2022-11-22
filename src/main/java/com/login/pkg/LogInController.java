package com.login.pkg;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogInController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	// For postman
	@RequestMapping(value = "/loginn", method = RequestMethod.POST)
	@ResponseBody
	public String welcome(ModelMap model, @RequestHeader String userId,@RequestHeader String password) {

		if (userId.equals("Abhishek") && password.equals("1234")) {
			return "login success  !!";
		}

		return "provid valid input";
	}

	// For Browser
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welCome(ModelMap model, @RequestParam String userId, @RequestParam String password) {

		if (userId.equals("Abhishek") && password.equals("1234")) {
			return "welcom";
		}
		model.put("msg", "Please provide the valid userId and password ?");
		return "login";
	}

}
