package com.Demo.CarService.model;

public class Vehicles {

	private String vehicleType;
	private String vehicleName;
	private String vehicleModel;
	private int vehicleDeposit;
	private int vehicleRent;
	private String imgURL;
	private String city;

	public Vehicles(String vehicleType, String vehicleName, String vehicleModel, int vehicleDeposit, int vehicleRent,
			String imgURL, String city) {
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.vehicleDeposit = vehicleDeposit;
		this.vehicleRent = vehicleRent;
		this.imgURL = imgURL;
		this.city = city;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getVehicleDeposit() {
		return vehicleDeposit;
	}

	public void setVehicleDeposit(int vehicleDeposit) {
		this.vehicleDeposit = vehicleDeposit;
	}

	public int getVehicleRent() {
		return vehicleRent;
	}

	public void setVehicleRent(int vehicleRent) {
		this.vehicleRent = vehicleRent;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
