package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.java.PetPals.dao.*;
import com.java.PetPals.model.Donations;


public class ShowDonationsMain {
	  public static void main(String[] args) {
	        DonationsDao dao = new DonationsDaoImpl();

	        try {
	            // Call the showDonations method to retrieve the list of donations
	            List<Donations> donationsList = dao.ShowDonations();

	            // Check if the donations list is empty
	            if (donationsList.isEmpty()) {
	                System.out.println("No donations found.");
	            } else {
	                // Iterate over the donations list and print each donation
	                for (Donations donation : donationsList) {
	                    System.out.println(donation);
	                }
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            // Handle any exceptions that occur during database operation
	            System.err.println("An error occurred while retrieving donations: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

}
