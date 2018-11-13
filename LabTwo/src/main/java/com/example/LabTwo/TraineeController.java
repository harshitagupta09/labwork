package com.example.LabTwo;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraineeController {

	@Autowired
	TraineeService service;

	// Index Page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/getPage", method = RequestMethod.GET)
	public String getStarted(@ModelAttribute("admin") Admin admin) {
		return "login";
	}

	@RequestMapping(path = "/getRecord", method = RequestMethod.POST)
	public ModelAndView auth(@ModelAttribute("admin") Admin admin) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		if (admin.getUname().equals("admin") && admin.getPassword().equals("12345"))
			mv.setViewName("management");
		return mv;

	}

	@RequestMapping(path = "/getDetails", method = RequestMethod.GET)
	public String getAdd(@ModelAttribute("t") Trainee t) {
		return "details";
	}

	@RequestMapping(path = "/newTrainee", method = RequestMethod.POST)
	public ModelAndView newTrainee(@ModelAttribute("trn") @Valid Trainee trn, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("details");
		String res = service.newRecord(trn, result);
		if (result.hasErrors())
			return mv;
		mv.setViewName("management");
		return mv;
	}

	@RequestMapping(path = "/deleteTrainee", method = RequestMethod.GET)
	public String deleteTrainee(@ModelAttribute("t") Trainee t) {
		return "delete";
	}

	@RequestMapping(path = "/delTrainee", method = RequestMethod.POST)
	public ModelAndView delTrainee(@ModelAttribute("t") @Valid Trainee t, BindingResult result) {
		Trainee trn = service.tdelete(t.getTid());
		ModelAndView mv = new ModelAndView();
		System.out.println(trn);
		mv.setViewName("management");
		return mv;
	}
	
	@RequestMapping(path = "/retrieveTrainee", method = RequestMethod.GET)
	public String retrieveTrainee(@ModelAttribute("t") Trainee t) {
		return "retrieve";
	}

	@RequestMapping(path = "/readTrainee", method = RequestMethod.POST)
	public ModelAndView readTrainee(@ModelAttribute("t") @Valid Trainee t, BindingResult result) {
		Trainee trn = service.tread(t.getTid());
		ModelAndView mv = new ModelAndView();
//		mv.addObject("id", trn.getTid());
//		mv.addObject("name",trn.getTname());
//		mv.addObject("location",trn.getTlocation());
		System.out.println(trn);
		mv.setViewName("retrieve");
		return mv;
	}

}
