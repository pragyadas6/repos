package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.bean.AdminEntity;
import com.pack.bean.VehicleEntity;
import com.pack.dao.EntityDao;

@Service
public class ServiceManagerImpl implements ServiceManager {

	@Autowired
    private EntityDao entityDao;
	
	@Transactional
	public void addVehicle(VehicleEntity vehicle) {
		entityDao.addVehicle(vehicle);
	}

	@Transactional
	public List<VehicleEntity> getAllVehicles() {
		return entityDao.getAllVehicles();
	}

	@Transactional
	public void setVehicleDao(EntityDao vehicleDao) {
		this.entityDao = vehicleDao;
	}

	@Override
	@Transactional
	public void addAdmin(AdminEntity admin) {
		entityDao.addAdmin(admin);
	}

	
}
