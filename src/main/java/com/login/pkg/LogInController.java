package com.login.pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogInController {
    // git token : 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
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	// For postman
	//@RequestMapping(value = "/loginn", method = RequestMethod.POST)
	@PostMapping("/loginn")
	@ResponseBody
	public String welcome(ModelMap model, @RequestHeader String userId,@RequestHeader String password) {

		if (userId.equals("Abhishek") && password.equals("1234")) {
			return "login success  !!";
		}

		return "provid valid input";
	}

	// For Browser
	//@RequestMapping(value = "/login", method = RequestMethod.POST)
	@PostMapping("/login")
	public String welCome(ModelMap model, @RequestParam String userId, @RequestParam String password) {

		if (userId.equals("Abhishek") && password.equals("1234")) {
			return "welcom";
		}
		model.put("msg", "Please provide the valid userId and password ?");
		return "login";
	}

}

