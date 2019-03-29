package com.pack.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.bean.AdminEntity;
import com.pack.bean.LoginEntity;
import com.pack.bean.VehicleEntity;
import com.pack.service.ServiceManager;

import oracle.jdbc.util.Login;

@Controller
public class EntityController {

	@Autowired
	private ServiceManager serviceManager;

	public void setVehicleManager(ServiceManager vehicleManager) {
		this.serviceManager = vehicleManager;
	}

	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addVehicle(
            @ModelAttribute(value = "vehicle") VehicleEntity vehicle,
            BindingResult result) {
    	Random r=new Random();
    	int num=r.nextInt(900000)+100000;
    	vehicle.setVehicleNo("ABC"+ String.valueOf(num));
        serviceManager.addVehicle(vehicle);
        return "updateVehicle";
	}*/

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("login", new LoginEntity());
		return "login";
	}

	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute(value ="employee") AdminEntity admin) {
		System.err.println();
		Random r=new Random();
		int num=r.nextInt(900000)+100000;
		admin.setAdminId("ABC"+String.valueOf(num));
		serviceManager.addAdmin(admin);
		return "redirect:/login";

	}


	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(ModelMap model) {
		model.addAttribute("admin", new AdminEntity());
		return "register";

	}

	/*@RequestMapping(value= "/register", method = RequestMethod.POST)
	public String addAdmin(
			@ModelAttribute(value = "admin") AdminEntity admin,
			BindingResult result) {
		Random r=new Random();
		int num=r.nextInt(900000)+100000;
		admin.setAdminId("ABC"+ String.valueOf(num));
		serviceManager.addAdmin(admin);
		return "login";
	}*/
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goToHome(
			/* @ModelAttribute(value = "login") LoginEntity login,
	            BindingResult result*/) {
		return "home";
	}
}
