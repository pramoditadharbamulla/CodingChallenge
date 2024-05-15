package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.PetPals.dao.*;
import com.java.PetPals.model.Shelters;

public class ShowShelterByID {
	public static void main(String[] args) {
		int ShelterId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ShelterId");
		ShelterId=sc.nextInt();
		SheltersDao dao = new SheltersDaoImpl();
		try {
			Shelters shelter= new Shelters();
			shelter=dao.ShowsheltersByID(ShelterId);
			System.out.println(shelter);
			
			
			
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
