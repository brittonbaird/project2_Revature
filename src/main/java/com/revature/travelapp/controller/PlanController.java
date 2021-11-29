package com.revature.travelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.travelapp.Create;
import com.revature.travelapp.entity.Plan;
import com.revature.travelapp.service.PlanService;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PlanController {

	PlanService planService;
	private static final Logger LOGGER = LoggerFactory.getLogger(PlanController.class);

	@Autowired
	public PlanController(PlanService planService) {
		super();
		this.planService = planService;
	}

	public PlanController() {

	}

	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	@RequestMapping(value = "/savePlan", method = RequestMethod.POST)
	public Plan AddPlans(@Validated(Create.class) @RequestBody Plan plan) {
		/*
		 * if(null != plan.getDateTravel() || plan.getDateTravel().toString() ==
		 * ""){
		 */

		if (null != plan.getTravelDate()) {
			
			plan.setTravelDate(new java.sql.Date(plan.getTravelDate().getTime()));
			// plan.setDateTravel(new java.sql.Date(new Date().getTime()));
		} else {
			
			plan.setTravelDate(new java.sql.Date(new Date().getTime()));
		}
		plan.setTravelDate(new java.sql.Date(new Date().getTime()));
		return planService.addPlan(plan);
	}

	@RequestMapping(value = "/plan", method = RequestMethod.POST)
	public List<Plan> GetPlans(@Validated(Create.class) @RequestBody Plan plan) {
		
		return planService.getPlansById(plan.getUserId());
	}

	@RequestMapping(value = "/deletePlace/{id}", method = RequestMethod.POST)
	public boolean deletePlan(@PathVariable int id, @Validated(Create.class) @RequestBody Plan plan) {
		
		planService.deletePlan(id);
		return true;
	}

}
