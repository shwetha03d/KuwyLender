package com.kuwy.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.kuwy.api.dto.VehicleDTO;

public class VehicleDAOImpl implements VehicleDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}

	List<VehicleDTO> vehicle=new ArrayList<>();
	
	@Override
	public List<VehicleDTO> getYear() {
		/*List<VehicleDTO> year=new ArrayList<>();*/
		
		try {
			String query="select year from vehicle";
			System.out.println("#query: " + query);
			vehicle = getJdbcTemplate()
					.query(query,
							(RowMapper<VehicleDTO>) new BeanPropertyRowMapper<VehicleDTO>(VehicleDTO.class));
			System.out.println("...");
			System.out.println(vehicle);
			System.out.println("...");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
	}

	@Override
	public List<VehicleDTO> getMakes(VehicleDTO dto) {
		//List<VehicleDTO> makes=new ArrayList<>();
		int year=dto.getYear();
		try {
			String query="select make from vehicle where year='"+year+"'";
			System.out.println("#query: " + query);
			vehicle = getJdbcTemplate()
					.query(query,
							(RowMapper<VehicleDTO>) new BeanPropertyRowMapper<VehicleDTO>(VehicleDTO.class));
			System.out.println("...");
			System.out.println(vehicle);
			System.out.println("...");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
	}

	@Override
	public List<VehicleDTO> getModel(VehicleDTO dto) {
		//List<VehicleDTO> models=new ArrayList<>();
		int year=dto.getYear();
		String make=dto.getMake();
		try {
			String query="select model from vehicle where year='"+year+"' and make='"+make+"'";
			System.out.println("#query: " + query);
			vehicle = getJdbcTemplate()
					.query(query,
							(RowMapper<VehicleDTO>) new BeanPropertyRowMapper<VehicleDTO>(VehicleDTO.class));
			System.out.println(".....");
			System.out.println(vehicle);
			System.out.println("...");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
	}

	@Override
	public List<VehicleDTO> getVarient(VehicleDTO dto) {
		int year=dto.getYear();
		String make=dto.getMake();
		String model=dto.getModel();
		try {
			String query="select varient from vehicle where year='"+year+"' and make='"+make+"' and model='"+model+"'";
			System.out.println("#query: " + query);
			vehicle = getJdbcTemplate()
					.query(query,
							(RowMapper<VehicleDTO>) new BeanPropertyRowMapper<VehicleDTO>(VehicleDTO.class));
			System.out.println(".....");
			System.out.println(vehicle);
			System.out.println("...");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
	}

	@Override
	public List<VehicleDTO> getLocation(VehicleDTO dto) {
		int year=dto.getYear();
		String make=dto.getMake();
		String model=dto.getModel();
		String varient=dto.getVarient();
		try {
			String query="select location from vehicle where year='"+year+"' and make='"+make+"' and model='"+model+"' and varient='"+varient+"'";
			System.out.println("#query: " + query);
			vehicle = getJdbcTemplate()
					.query(query,
							(RowMapper<VehicleDTO>) new BeanPropertyRowMapper<VehicleDTO>(VehicleDTO.class));
			System.out.println(".....");
			System.out.println(vehicle);
			System.out.println("...");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vehicle;
	}
	
	
	
	
	
	




	

	
	
}
