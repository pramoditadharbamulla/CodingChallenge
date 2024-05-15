package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.PetPals.dao.*;
import com.java.PetPals.model.Pets;
public class ShowPetsIDMain {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter PetID");
		
	     int  PetID=sc.nextInt();
	     PetsDao dao=new PetsDaoImpl();
	     try {
			Pets pets= dao.ShowPetsByID(PetID);
			if(pets==null) {
				System.out.println("invalid petID");
			}else {
				
			
			System.out.println(pets);}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
}
