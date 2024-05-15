package com.java.PetPals.main;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.java.PetPals.dao.*;

import com.google.protobuf.TextFormat.ParseException;
import com.java.PetPals.model.AdoptionEvents;

public class AddAdoptionsMain {
	public static void main(String[] args) throws java.text.ParseException, ParseException {
		
		
	AdoptionEvents adoptionevents = new AdoptionEvents();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter EventID");
	adoptionevents.setEventID(sc.nextInt());
	System.out.println("enter EventName");
	adoptionevents.setEventName(sc.next());
	System.out.print("Enter date (yyyy-MM-dd): ");
	String DateString=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date date = dateFormat.parse(DateString);
	 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	 adoptionevents.setDate(sqlDate);
	System.out.println("enter Location");
	adoptionevents.setLocation(sc.next());
	AdoptionEventsDao dao = new  AdoptionsDaoImpl();
	try {
		Boolean Success=dao.CreateAdoptionEvents(adoptionevents);
		if(Success==true) {
			System.out.println("data inserted succesfully");
		}
		else {
			System.out.println("data not inserted");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

}
