package com.techment.admin;

import java.util.HashMap;
import java.util.Map;

public class HospitalStore {
	
	private Map<String, Hospital> hospitalMap = new HashMap<>();
	
	private HospitalStore(){
		//dummy data
		hospitalMap.put("CH Apollo", new Hospital(3,491005,"CH Apollo Hospital","Sector-D","Pune","Maharashtra"));
	}
	
	Hospital h =new Hospital();
	
	private static HospitalStore instance = new HospitalStore();
	public static HospitalStore getInstance(){
		return instance;
	}
	
	public Hospital getHospital(String name) {
		return hospitalMap.get(name);
	}

	public void putPerson(Hospital person) {
		hospitalMap.put(person.getName(), person);
	}
}
