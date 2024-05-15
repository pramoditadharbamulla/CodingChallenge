package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.PetPals.model.*;

import com.java.PetPals.dao.*;

public class AddDonationsMain {
    public static void main(String[] args) {
        try {
            // create a new instance of the DonationsDAO class
            DonationsDao DAO = new DonationsDaoImpl();

            // create a new scanner to read input from the console
            Scanner scanner = new Scanner(System.in);

            // prompt the user to enter the donor name
            System.out.print("Enter donor name: ");
            String donorName = scanner.nextLine();

            // prompt the user to enter the donation type (cash or item)
            System.out.print("Enter donation type (cash/item): ");
            String donationType = scanner.nextLine();

            // prompt the user to enter the donation amount
            System.out.print("Enter donation amount: ");
            double donationAmount = scanner.nextDouble();

            // prompt the user to enter the donation item (if applicable)
            scanner.nextLine(); // consume the newline character
            System.out.print("Enter donation item (if applicable): ");
            String donationItem = scanner.nextLine();

            // prompt the user to enter the donation date (yyyy-mm-dd)
            System.out.print("Enter donation date (yyyy-mm-dd): ");
            String donationDateStr = scanner.nextLine();
            java.sql.Date donationDate = java.sql.Date.valueOf(donationDateStr);
            Donations donation= new Donations();
            DAO.AddDonations(donation);

            // add the donation to the database
          

            // print a success message
            System.out.println("Donation added successfully!");

        } catch (SQLException e) {
            // print any exceptions that occur
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


}
