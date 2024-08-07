package com.cnc.calculation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	    @GetMapping("/add")
	    public int add(@RequestParam int a, @RequestParam int b) {
	        return a + b;
	    }

	    @GetMapping("/subtract")
	    public int subtract(@RequestParam int a, @RequestParam int b) {
	        return a - b;
	    }
	    @GetMapping("/multiply")
	    public int multiply(@RequestParam int a, @RequestParam int b) {
	        return a * b;
	    }
	    
	    @GetMapping("/division")
	    public int division(@RequestParam int a, @RequestParam int b) {
	        return a / b;
	    }
	}

