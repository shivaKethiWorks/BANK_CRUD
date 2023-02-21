package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.WeatherService;

import io.swagger.annotations.ApiOperation;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/weather")
	@ApiOperation("To get the weather json of a location")
	public String getWeather(@RequestParam String location) {
		return weatherService.getWeather(location);
	}
}