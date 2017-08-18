package com.corejava.collection;

public class Parked_CarOwner_Details {
	
	private String carModel,ownerAddress,ownerName;
	private long carNO, ownerMobileNo;
	
	public Parked_CarOwner_Details(String carModel, String ownerAddress, String ownerName, long carNO,
			long ownerMobileNo) {
		super();
		this.carModel = carModel;
		this.ownerAddress = ownerAddress;
		this.ownerName = ownerName;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
	}
	public Parked_CarOwner_Details() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getCarNO() {
		return carNO;
	}
	public void setCarNO(long carNO) {
		this.carNO = carNO;
	}
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
	
}
