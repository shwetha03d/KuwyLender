package com.kuwy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kuwy.api.dao.VehicleDAO;
import com.kuwy.api.dto.VehicleDTO;

public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleDAO dao;
	
	
	@Override
	public List<VehicleDTO> getYear() {
		return this.dao.getYear();
	}

	@Override
	public List<VehicleDTO> getMake(VehicleDTO dto) {
		return this.dao.getMakes(dto);
	}

	@Override
	public List<VehicleDTO> getModel(VehicleDTO dto) {
		return this.dao.getModel(dto);
	}

	@Override
	public List<VehicleDTO> getVarient(VehicleDTO dto) {
		return this.dao.getVarient(dto);
	}

	@Override
	public List<VehicleDTO> getLocation(VehicleDTO dto) {
		return this.dao.getLocation(dto);
	}
	
	
	
	
	
	
	

}
