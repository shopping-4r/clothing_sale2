package com.yc.form.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.form.bean.User;
@Controller
public class UserAction {
	@RequestMapping("/register.do")
	public String doRegister(Model model, @Validated User user, Errors errors) {
	    if (errors.hasErrors()) {
	        model.addAttribute("errors", errors);
	        return "form";
	    }
	    model.addAttribute(user);
	    return "index";
	}
}
