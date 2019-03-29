package com.pack.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.bean.AdminEntity;
import com.pack.bean.VehicleEntity;

@Repository
public class EntityDaoImpl implements EntityDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addVehicle(VehicleEntity vehicle) {
		this.sessionFactory.getCurrentSession().save(vehicle);
	}

	@Override
	public List<VehicleEntity> getAllVehicles() {
        return this.sessionFactory.getCurrentSession().createQuery("from Vehicle").list();
	}

	@Override
	public void addAdmin(AdminEntity admin) {
		this.sessionFactory.getCurrentSession().save(admin);
	}
}
