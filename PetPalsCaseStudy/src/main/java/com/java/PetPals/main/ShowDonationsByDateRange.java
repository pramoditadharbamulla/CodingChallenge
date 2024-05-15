package com.java.PetPals.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import com.java.PetPals.dao.*;

import com.java.PetPals.model.Donations;

public class ShowDonationsByDateRange {
	public static void main(String[] args) {
		
	
	Date startDate = null;
    Date endDate = null;
	
	Scanner sc= new Scanner(System.in);
	Donations incident=new Donations();
	System.out.print("Enter startDate (yyyy-MM-dd): ");
	String DateString1=sc.next();
	System.out.print("Enter endDate (yyyy-MM-dd): ");
	String DateString2=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 try {
			java.util.Date date1 = dateFormat.parse(DateString1);
			java.util.Date date2 = dateFormat.parse(DateString2);
			  startDate = new java.sql.Date(date1.getTime());
             endDate = new java.sql.Date(date2.getTime());
			
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DonationsDao dao = new DonationsDaoImpl();
	 try {
		List<Donations>incidentList=dao.getDonationsDateRange(startDate, endDate);
		for (Donations incidents : incidentList) {
			System.out.println(incidents);
			
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
