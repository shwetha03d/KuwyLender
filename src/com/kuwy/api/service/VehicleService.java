package com.kuwy.api.service;

import java.util.List;

import com.kuwy.api.dto.VehicleDTO;

public interface VehicleService {
	
	public List<VehicleDTO> getYear();
	
	public List<VehicleDTO> getMake(VehicleDTO dto);
	
	public List<VehicleDTO> getModel(VehicleDTO dto);
	
	public List<VehicleDTO> getVarient(VehicleDTO dto);
	
	public List<VehicleDTO> getLocation(VehicleDTO dto);

}
