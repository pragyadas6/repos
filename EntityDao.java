package com.pack.dao;

import java.util.List;

import com.pack.bean.AdminEntity;
import com.pack.bean.VehicleEntity;


public interface EntityDao {

	public void addVehicle(VehicleEntity employee);
    public List<VehicleEntity> getAllVehicles();
    public void addAdmin(AdminEntity admin);
}
