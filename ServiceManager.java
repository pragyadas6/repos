package com.pack.service;

import java.util.List;

import com.pack.bean.AdminEntity;
import com.pack.bean.VehicleEntity;

public interface ServiceManager {

	public void addVehicle(VehicleEntity vehicle);
	void addAdmin(AdminEntity admin);
	public List<VehicleEntity> getAllVehicles();
}
