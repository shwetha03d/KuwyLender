package com.kuwy.api.dao;

import java.util.List;

import com.kuwy.api.dto.VehicleDTO;

public interface VehicleDAO {
	
	public List<VehicleDTO> getYear();
	
	public List<VehicleDTO> getMakes(VehicleDTO dto);
	
	public List<VehicleDTO> getModel(VehicleDTO dto);
	
	public List<VehicleDTO> getVarient(VehicleDTO dto);
	
	public List<VehicleDTO> getLocation(VehicleDTO dto);
	

}
