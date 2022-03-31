package com.practica1.practica1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica1.practica1.service.SvcIntegrante;

@Controller
public class CtrlIntegrante {
	
	@Autowired
	private SvcIntegrante svc;
	
	@RequestMapping("/integrante")
	public String index() {
		return "index";
	}
	
	@PostMapping("/procesa")
	public String procesa(HttpServletRequest request, Model model) throws Exception{
		svc.createIntegrante(request.getParameter("nombre"));
		model.addAttribute("integrante", svc.getIntegrantes());
		return "nombres";
	}
}