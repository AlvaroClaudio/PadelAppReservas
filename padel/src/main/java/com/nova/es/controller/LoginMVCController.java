package com.nova.es.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nova.es.dto.LoginDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@RequestMapping("/login")
@CrossOrigin
public class LoginMVCController {

    @GetMapping()
    public String getLoginPage(Model model) {
      
    	model.addAttribute("login",new LoginDto());
    	
        return "login";
    } 
    
    @PostMapping()
    public String login(@RequestBody LoginDto dto) {
      
      System.out.println("has intentando logguearte: " + dto.getUsername());
      
      //ahora con esos datos hay que crear el loginservice y loginrepository y la entidad usuario de bbdd
      
      String pw="viene de la bbdd";
      
      if(dto.getPassword().equals(pw)) {

    	  return "reserva";
    	  
      }else {
    	  
    	  //en algun sitio meterias el mensaje de pw incorrecto y lo muestras
    	  
    	  return "login";
      }
        
    } 
    
}
