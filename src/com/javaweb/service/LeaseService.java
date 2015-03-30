package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Lease;

public interface LeaseService {
	public boolean addLease(Lease lease);
	
	public boolean deleteLease(int id);
	
	public boolean updateLease(Lease lease);
	
	public List queryAllLease();
	
	public Lease queryLeaseByID(int id);
}