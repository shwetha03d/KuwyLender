package com.kuwy.api.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuwy.api.dto.VehicleDTO;
import com.kuwy.api.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService service;
	
	@RequestMapping(value="year", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<VehicleDTO> getYear(){
		List<VehicleDTO> list=this.service.getYear();
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="make", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<VehicleDTO> getMake(VehicleDTO dto){
		List<VehicleDTO> list=this.service.getMake(dto);
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="model", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<VehicleDTO> getModel(VehicleDTO dto){
		List<VehicleDTO> list=this.service.getModel(dto);
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="varient", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<VehicleDTO> getVarient(VehicleDTO dto){
		List<VehicleDTO> list=this.service.getVarient(dto);
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="location", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<VehicleDTO> getLocation(VehicleDTO dto){
		List<VehicleDTO> list=this.service.getVarient(dto);
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	
	

}
