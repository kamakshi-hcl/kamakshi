package com.leave.leave.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.leave.leave.model.ApprovalInfo;
import com.leave.leave.model.User;
@Service
public interface ApproverService {
	public ApprovalInfo save(ApprovalInfo approver);
	public Optional<ApprovalInfo> getUserDetails(String employeeName);
}
