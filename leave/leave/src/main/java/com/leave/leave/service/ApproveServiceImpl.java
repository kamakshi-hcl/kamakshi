package com.leave.leave.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.leave.leave.model.ApprovalInfo;
import com.leave.leave.repositary.ApprovalRepository;


@Service
public class ApproveServiceImpl implements ApproverService{
	
	@Autowired
	private ApprovalRepository repository;
	@Override
	public ApprovalInfo save(ApprovalInfo approver) {
		
			
			return repository.save(approver);
		
		

		
	}
	@Override
	public Optional<ApprovalInfo> getUserDetails(String employeeName) {
		
		return repository.findByEmployeeName(employeeName);
	}
		
	

}
