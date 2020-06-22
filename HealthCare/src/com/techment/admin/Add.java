package com.techment.admin;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Add {
	
	public static String getPersonData(String name) throws IOException{
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:3000/hospitals" + name).openConnection();
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();
		if(responseCode == 200){
			String response = "";
			Scanner scanner = new Scanner(connection.getInputStream());
			while(scanner.hasNextLine()){
				response += scanner.nextLine();
				response += "\n";
			}
			scanner.close();
			return response;
		}
		// an error happened
		return null;
	}
	public static void setPersonData(String name, String birthYear, String about) throws IOException{
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:3000/hospitals" + name).openConnection();

		connection.setRequestMethod("POST");
		String postData = "name=" + URLEncoder.encode(name);
		postData += "&about=" + URLEncoder.encode(about);
		postData += "&birthYear=" + birthYear;
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(postData);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
		if(responseCode == 200){
			System.out.println("POST was successful.");
		}
		else if(responseCode == 401){
			System.out.println("Wrong password.");
		}
	}

}
