package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.PetPals.dao.*;

import com.java.PetPals.model.Shelters;

public class AddSheltersMain {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        SheltersDao dao = new SheltersDaoImpl();

	        try {
	            // Get input from the user for the new shelter
	            System.out.println("Enter the Shelter ID:");
	            int shelterID = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            System.out.println("Enter the name of the shelter:");
	            String name = scanner.nextLine();

	            System.out.println("Enter the location of the shelter:");
	            String location = scanner.nextLine();

	            // Create a new Shelters object with user input
	            Shelters newShelter = new Shelters();
	            newShelter.setShelterID(shelterID);
	            newShelter.setName(name);
	            newShelter.setLocation(location);

	            // Call the addShelters method to add the new shelter to the database
	            boolean success = dao.AddShelters(newShelter);
	            if (success) {
	                System.out.println("New shelter added successfully!");
	            } else {
	                System.out.println("Failed to add the new shelter.");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            // Handle any exceptions that occur during database operation
	            System.err.println("An error occurred while adding the shelter: " + e.getMessage());
	            e.printStackTrace();
	        } 

}
}
