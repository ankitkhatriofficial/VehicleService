package com.Demo.CarService.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	private List<Vehicles> initialize() {
		List<Vehicles> list = new ArrayList<Vehicles>();
		list.add(new Vehicles("Bike", "Activa", "Scooter", 2000, 400,
				"https://www.ridobiko.com/sample_images/activa.png", "Delhi"));
		list.add(new Vehicles("Bike", "FZ", "Bike", 2000, 700, "https://www.ridobiko.com/sample_images/fz.png",
				"Delhi"));
		list.add(new Vehicles("Car", "Wagon R", "Economy", 5000, 1200,
				"https://www.ridobiko.com/sample_images/wagon.png", "Delhi"));
		list.add(new Vehicles("Car", "Swift", "Sedan", 2000, 1800, "https://www.ridobiko.com/sample_images/swift.png",
				"Delhi"));
		list.add(new Vehicles("Bike", "Pulsar", "Bike", 2000, 800,
				"https://media.zigcdn.com/media/model/2020/May/bajaj-pulsar-rs-200-a-right-side-view_360x240.jpg",
				"Hyd"));
		return list;
	}

	public List<Vehicles> getAllVehicles() {
		return initialize();
	}

	public List<Vehicles> findByVehicleType(String type) {
		List<Vehicles> allVehicles = initialize();
		Iterator<Vehicles> itr = allVehicles.iterator();
		List<Vehicles> returnValue = new ArrayList<Vehicles>();

		while (itr.hasNext()) {

			Vehicles v = itr.next();

			if (v.getVehicleType().equalsIgnoreCase(type)) {
				returnValue.add(v);
			}
		}
		return returnValue;
	}

	public List<Vehicles> findByCity(String city) {
		List<Vehicles> allVehicles = initialize();
		Iterator<Vehicles> itr = allVehicles.iterator();
		List<Vehicles> returnValue = new ArrayList<Vehicles>();

		while (itr.hasNext()) {
			Vehicles v = itr.next();
			if (v.getCity().equalsIgnoreCase(city)) {
				returnValue.add(v);
			}
		}

		return returnValue;
	}

	public List<Vehicles> findByAll(String city, String type) {

		if (city.equalsIgnoreCase("all"))
			return findByVehicleType(type);

		List<Vehicles> allVehicles = initialize();
		Iterator<Vehicles> itr = allVehicles.iterator();
		List<Vehicles> returnValue = new ArrayList<Vehicles>();

		while (itr.hasNext()) {
			Vehicles v = itr.next();
			if (v.getCity().equalsIgnoreCase(city) && v.getVehicleType().equalsIgnoreCase(type)) {
				returnValue.add(v);
			}
		}
		return returnValue;
	}

}
