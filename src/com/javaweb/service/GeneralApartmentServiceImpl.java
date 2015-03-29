package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.GeneralApartmentDAO;
import com.javaweb.po.GeneralApartment;

public class GeneralApartmentServiceImpl implements GeneralApartmentService {
	private GeneralApartmentDAO generalApartmentDAO;

	public void setGeneralApartmentDAO(GeneralApartmentDAO generalApartmentDAO) {
		this.generalApartmentDAO = generalApartmentDAO;
	}

	// add Student
	@Override
	public boolean addGeneralApartment(GeneralApartment generalApartment) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,generalApartment.getId()) == null) {
			generalApartmentDAO.save(generalApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteGeneralApartment(int id) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,id) != null) {
			generalApartmentDAO.delete(GeneralApartment.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateGeneralApartment(GeneralApartment generalApartment) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,generalApartment.getId()) != null) {
			generalApartmentDAO.update(generalApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllGeneralApartment() {
		return generalApartmentDAO.queryAll(GeneralApartment.class);
	}

	@Override
	public GeneralApartment queryGeneralApartmentByID(int id) {
		return generalApartmentDAO.queryByID(GeneralApartment.class,id);
	}


}