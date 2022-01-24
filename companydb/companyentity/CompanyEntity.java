package com.xworkz.companydb.companyentity;

public class CompanyEntity {
	int cid;
	String cname;
	String location;
	boolean isprivate;
	int noOfEmp;
	String grade;
	int noOfBranches;

	public CompanyEntity(int cid, String cname, String location, boolean isprivate, int noOfEmp, String grade,
			int noOfBranches) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.location = location;
		this.isprivate = isprivate;
		this.noOfEmp = noOfEmp;
		this.grade = grade;
		this.noOfBranches = noOfBranches;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isIsprivate() {
		return isprivate;
	}

	public void setIsprivate(boolean isprivate) {
		this.isprivate = isprivate;
	}

	public int getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
}
