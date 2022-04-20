package com.positions.info.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntradayPositionDetails {
	
	@RequestMapping(value="/positions/{userId}", method=RequestMethod.GET)
	public String getIntradayPositionDetails(@PathVariable String userId) {
		return "Net Loss = 1000";
	}

}
