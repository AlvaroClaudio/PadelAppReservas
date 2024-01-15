package com.nova.es.service;

import java.util.List;

import com.nova.es.dto.CreateReservaDto;
import com.nova.es.dto.ReservaDto;

public interface ReservaService {

	List<ReservaDto> getAllReservas();

	ReservaDto getReservaById(int id);

	ReservaDto createReserva(ReservaDto reservaDTO);
	
	ReservaDto createReserva(CreateReservaDto reservaDTO);

	ReservaDto updateReserva(int id, ReservaDto reservaDTO);

	void deleteReserva(int id);

}