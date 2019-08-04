package com.praveen.demo.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class CommonController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor
				(dateFormat, false));
	}
}
