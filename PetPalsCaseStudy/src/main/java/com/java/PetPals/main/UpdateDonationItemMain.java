package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.PetPals.dao.*;

import com.java.PetPals.model.Donations;

public class UpdateDonationItemMain {
	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
	            Donations donations = new Donations();
       System.out.println("Enter DonationID:");
       int DonationID = sc.nextInt();
       if (DonationID <= 0) {
           System.out.println("Invalid IncidentID. Please enter a positive integer.");
           return;
       }
       donations.setDonationID(DonationID);
       
       System.out.println("Enter new DonationItem:");
       String DonationItem = sc.next();
       if (DonationItem.isEmpty()) {
           System.out.println("Status cannot be empty.");
           return;
       }
       donations.setDonationItem(DonationItem);
       
   	DonationsDao dao = new DonationsDaoImpl();
       try {
           Boolean success = dao.updateDonationsItem(donations.getDonationItem(), donations.getDonationID());
           if (success) {
               System.out.println("Donations status updated successfully.");
           } else {
               System.out.println("Failed to update Donations status. Donations not found or status unchanged.");
           }
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("An error occurred while updating Donations status: " + e.getMessage());
       }
   } catch (Exception e) {
       System.out.println("An error occurred: " + e.getMessage());
   }
	}

}
