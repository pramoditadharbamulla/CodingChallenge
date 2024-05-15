package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.java.PetPals.dao.*;

import com.java.PetPals.model.Donations;

public class ShowDonationsByDonarName {
    public static void main(String[] args) {
        DonationsDao donationsDAO = new DonationsDaoImpl();
        Scanner sc= new Scanner(System.in);
       String  DonarName=sc.next();

        try {
            List<Donations> donationsList = donationsDAO.ShowDonationsByDonarName(DonarName);

            if (donationsList!= null &&!donationsList.isEmpty()) {
                for (Donations donation : donationsList) {
                    System.out.println("Donation ID: " + donation.getDonationID());
                    System.out.println("Donar Name: " + donation.getDonarName());
                    System.out.println("Donation Type: " + donation.getDonationType());
                    System.out.println("Donation Amount: " + donation.getDonationAmount());
                    System.out.println("Donation Item: " + donation.getDonationItem());
                    System.out.println("Donation Date: " + donation.getDonationDate());
                    System.out.println();
                }
            } else {
                System.out.println("No donations found for the given donor name.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
