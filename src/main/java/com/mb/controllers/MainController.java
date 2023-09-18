package com.mb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mb.util.Translator;


@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping("/msg")
	public String getMessage(@RequestParam("msg") String message) {
		return Translator.toLocale(message);
	}
}
