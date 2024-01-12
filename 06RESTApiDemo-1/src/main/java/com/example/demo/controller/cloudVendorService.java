package com.example.demo.controller;

import java.security.PublicKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorService {
 
	
	cloudVendor CloudVendor;
	
	@GetMapping("{vendorId}")
	public cloudVendor grtCloudVendorDetails(String vendorId) {
		return CloudVendor ;
				//new cloudVendor("c1", "Vendor1", "Address","xxxx");
		
		
	}
	@PostMapping
	public String creatrCloudVendorDetails( @RequestBody cloudVendor cloudVendor) {
		
		this.CloudVendor=CloudVendor;
		return "cloud vendor created successfully";
		
	}
	
	

}
