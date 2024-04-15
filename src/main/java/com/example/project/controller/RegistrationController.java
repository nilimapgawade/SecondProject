package com.example.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.Dto.LoginDto;
import com.example.project.Dto.RegisterDto;
import com.example.project.Dto.ResetpwdDto;
import com.example.project.Dto.UserDto;
import com.example.project.entity.CountryEntity;
import com.example.project.service.UserService;

@Controller
public class RegistrationController {

	@Autowired(required = true)
	private UserService userservice;

	// here you need to get country state city values
	@GetMapping("/registerPage")
	public String registerPage(Model model) {

//		List<CountryEntity> countryList = new ArrayList();
//
//		countryList = userservice.getAllCountry();
//
//		model.addAttribute("countryOptions", countryList);

		return "register";
	}

	@RequestMapping("/{countryId}")
	public Map<Integer, String> getStates(@PathVariable Integer cid) {

		Map<Integer, String> map = new HashMap<>();
		return map;

	}

	@RequestMapping("/{stateId}")
	public Map<Integer, String> getCities(@PathVariable Integer sid) {

		Map<Integer, String> map = new HashMap<>();
		return map;
	}

	@RequestMapping("/request")
	public String register(RegisterDto regDto) {

		return "";

	}

	@GetMapping("/login")
	public String loginPage(Model model) {
		return "login";
	}

	@GetMapping("index")
	public String home() {
		return "index";
	}

	@PostMapping("/login")
	public String login(LoginDto loginDto, Model model) {

		UserDto user =userservice.getUser(loginDto);
		if(user == null) {
			model.addAttribute("emsg","Invalid credentials");
			return "login";
		}
		
		if("YES".equalsIgnoreCase(user.getPasswordUpdated())) {
			
			return "redirect:dashboard";
		}else {
			
			model.addAttribute("resetPwdDto",new ResetpwdDto());
			return "resetPwdView";
		}
		
	}

	@PostMapping("/resetPwd")
	public String resetPwd(ResetpwdDto pwdDto, Model model) {

		UserDto user = userservice.getUser(pwdDto.getEmail());

		if (user.getPassword().equals(pwdDto.getOldPwd())) {

			boolean resetPwd = userservice.resetPwd(pwdDto);

			if (resetPwd) {

				return "redirect:dashboard";

			} else {

				model.addAttribute("emsg", "pwd update failed");
				return "resetPwdView";
			}

		} else {
			model.addAttribute("emsg", "Given old pwd is invalid");
			return "resetPwdView";
		}

	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		return "dashboard";

	}

	public String logout() {

		return "logout";
	}
}
