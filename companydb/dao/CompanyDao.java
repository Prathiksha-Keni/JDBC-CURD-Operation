package com.xworkz.companydb.dao;

import com.xworkz.companydb.companyentity.CompanyEntity;

public interface CompanyDao {
	public void insertEntity(CompanyEntity companyEntity);

	public void updateEntity(String grade, int id);

	public void deleteEntity(int id);

	public void readEntity();

	public void readAllEntity();
}
