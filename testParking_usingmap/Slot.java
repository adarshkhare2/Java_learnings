package com.testParking_usingmap;

import java.util.LinkedHashMap;
import java.util.Map;

import com.parkingtask.Vehicles;

public class Slot {

	public static void main(String[] args) {
		
		Map< Integer, Info> m = new LinkedHashMap<>();
		Info i = new Info(1, "xl");
		m.put(1, i);
	}
}
