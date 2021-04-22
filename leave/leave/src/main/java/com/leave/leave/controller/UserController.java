package com.leave.leave.controller;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leave.leave.model.ApprovalInfo;
import com.leave.leave.model.User;
import com.leave.leave.service.ApproverService;
import com.leave.leave.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService service;
	
	@Autowired
	private ApproverService appService;
	
	@GetMapping("/")
	public String home() {
		return "default";
	}
	
	@GetMapping("/register")
	public String RegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/register")
	public String newUser(@ModelAttribute User user,HttpSession session,Model model) {
		
		User user1 = new User(user.getId(),user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),user.getEmail(),user.getRole(),user.getApproval());
		ApprovalInfo approval=new ApprovalInfo();
		approval.setUser(user1);
		session.setAttribute("approval", approval);
		service.saveUser(user1);
		appService.save(approval);
		
		
		
			return "redirect:/";
		}
	
	@GetMapping("/userlogin")
	public String loginPage(Model model) {
		model.addAttribute("user1", new User());
		return "login";
	}
	
	@RequestMapping("/userlogin")
	public String loginProcess(@ModelAttribute User user1, Model model, HttpSession session) {
		User user2 = service.getUserDetails(user1.getUserName()).get();
		if (service.validateUser(user2, user1)) {
			
			session.setAttribute("user1", user2);
			return "home";
		} else {
			model.addAttribute("user1", new User());
			model.addAttribute("msg", "User Name or Password is incorrect");
			return "login";
		}
	}
	
	@GetMapping("/changepassword")
	public String changePassword(Model model,HttpSession session) {
		model.addAttribute("user", new User());
		User name=(User) session.getAttribute("user1");
	
		model.addAttribute("welcome", name.getFirstName()+name.getLastName());

		return "changepassword";
	}
	@PostMapping("/changepassword")
    public String newPassword(@RequestParam String newpassword,@RequestParam String confirmpassword,HttpSession session,Model model) {
        User user3= (User) session.getAttribute("user1");
        
        if(newpassword.equals(confirmpassword)) {
        	service.UpdatePassword(newpassword,user3);
			model.addAttribute("success", "Password Changed Successfully");

 return "home";
        }else
			model.addAttribute("msg", "Sorry! Password Mismatch ");

        
            return "changepassword";
        }
	
	@GetMapping("/applyleave")
	public String applyLeave(Model model) {
		model.addAttribute("approval", new ApprovalInfo());
		return "applyleave";
	}
	@PostMapping("/applyleave")
	public String applyLeave(@ModelAttribute ApprovalInfo approval,HttpSession session,Model model) {
		
		
		appService.save(approval);
		
		
			return "home";
		}
	

}
