package com.Demo.CarService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Demo.CarService.model.VehicleService;
import com.Demo.CarService.model.Vehicles;

@Controller
public class FilterController {

	@Autowired
	VehicleService vehicleService;

	@GetMapping("/")
	public String index() {
		return "redirect:/filter";
	}

	@GetMapping("/filter")
	public String showFilterPage() {
		return "filterForm.jsp";
	}

	@GetMapping("/page")
	public String page() {
		return "redirect:/filter";
	}

	@PostMapping("/page")
	public String processedFilter(@RequestParam("states") String states, @RequestParam("vehicle") String vehicles,
			Model model) {

		List<Vehicles> list = vehicleService.findByAll(states, vehicles);

		if (list.isEmpty()) {
			model.addAttribute("status", 0);
			return "page.jsp";
		}
		model.addAttribute("status", "1");
		model.addAttribute("vehicles", list);

		return "page.jsp";
	}

}
