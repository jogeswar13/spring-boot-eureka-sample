package com.jogi.springeurekaclientschoolservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SchoolServiceController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/getSchoolDetails/{schoolname}")
	public String getStudents(@PathVariable String schoolname) {

		System.out.println("Getting School details for " + schoolname);

		String response = restTemplate.exchange("http://student-service/getStudentDetailsForSchool/{schoolname}",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}, schoolname).getBody();

		System.out.println("Response Received as " + response);

		return "School Name -  " + schoolname + " \n Student Details " + response;
	}

}
