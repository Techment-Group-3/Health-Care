package com.techment.admin;

import java.io.FileReader;
  import java.io.*;
  import java.util.*;
  import org.json.simple.*;
  import org.json.simple.parser.*;

public class HospitalRead {
	public static void main(String[] args) {
		
		 JSONParser parser = new JSONParser();
	       try {
	         Object obj = parser.parse(new FileReader("/home/yasmin/eclipse-workspace/HealthCare/resources/db/db.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	        
	     	JSONArray hospitalList = (JSONArray) jsonObject.get("hospitals");
			Iterator<JSONObject> iterator = hospitalList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	       }
	      catch(Exception e) {
	         e.printStackTrace();
	      }

	}
}
