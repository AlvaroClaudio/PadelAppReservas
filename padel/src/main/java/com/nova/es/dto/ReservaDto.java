package com.nova.es.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaDto {
	
	private String id;
   
    private String nombre;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dia;
          
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime horaInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime horaFin;
    
    private LocalDateTime fechaHoraInicio;
    
    private LocalDateTime fechaHoraFin;    
    
     
}


