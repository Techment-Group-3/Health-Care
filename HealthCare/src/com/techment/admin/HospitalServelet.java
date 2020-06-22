package com.techment.admin;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

@WebServlet("/HospitalServelet")
public class HospitalServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    Gson gson = new Gson();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet class");
		int hid=Integer.parseInt(request.getParameter("hid"));
		int pincode=Integer.parseInt(request.getParameter("hpincode"));
		String name=request.getParameter("hname");
		String address=request.getParameter("haddress");
		String street=request.getParameter("hstreet");
		String state=request.getParameter("hstate"); 
		System.out.println(name);
//		int hid=8,pincode=491001;
//		String name="bushra",address="dffrfe",state="fjv,bf,jd",street="lkfvnf";
		Hospital h = new Hospital();
		
		h.setId(hid);
		h.setName(name);
		h.setAddress(address);
		h.setPincode(pincode);
		h.setState(state);
		h.setStreet(street);
		
		String jsonstring=gson.toJson(h);

		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		out.print(jsonstring);
		System.out.println("Servlet class2");

		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:3000/hospitals").openConnection();
		System.out.println("Servlet class");

		 connection.setDoOutput(true);
		 connection.setRequestMethod("POST");
		 connection.setRequestProperty("Content-Type", "application/json");
		System.out.println("Servlet class1");

		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
		System.out.println("Servlet class1");

	    wr.write(jsonstring);
		System.out.println("Servlet class1");

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
