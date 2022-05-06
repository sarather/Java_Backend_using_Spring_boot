package com.liveasytransport.transportdetails.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasytransport.transportdetails.entities.Load;
import com.liveasytransport.transportdetails.services.LoadService;

@RestController
public class MyController {
	@Autowired
	private LoadService ls;
	
	@GetMapping("/load")
	public List<Load> getLoads(){
		return this.ls.getLoads();
		}
	
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.ls.getLoad(Long.parseLong(loadId));
	}
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		return this.ls.addLoad(load);
	}
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load) {
		return this.ls.updateLoad(load);
	}
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.ls.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
