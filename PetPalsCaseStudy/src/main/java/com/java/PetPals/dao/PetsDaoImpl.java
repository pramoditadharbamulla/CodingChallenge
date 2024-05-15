package com.java.PetPals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.PetPals.model.Pets;


import com.java.PetPals.Util.*;


public class PetsDaoImpl implements PetsDao{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Pets> Showpets() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  pets";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Pets>petsList=new ArrayList<Pets>();
		
		while(rs.next()) {
			
			Pets pets= new Pets();
			pets.setPetID(rs.getInt("petID"));
			pets.setName(rs.getString("Name"));
			pets.setAge(rs.getInt("Age"));
			pets.setBreed(rs.getString("Breed"));
			pets.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pets.setTypesofpet(rs.getString("TypesOfPets"));
		    petsList.add(pets);
		}
		return petsList;
		
	}

	@Override
	public Pets ShowPetsByID(int PetID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  Pets where PetID=? ";
		
		pst=connection.prepareStatement(cmd);
	
		pst.setInt(1, PetID);
		ResultSet rs=pst.executeQuery();
		Pets pets= new Pets();
    while(rs.next()) {
	
			
			pets.setPetID(rs.getInt("petID"));
			pets.setName(rs.getString("Name"));
			pets.setAge(rs.getInt("Age"));
			pets.setBreed(rs.getString("Breed"));
			pets.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pets.setTypesofpet(rs.getString("TypesOfPets"));
		
		}
          return pets;
	
	}

	@Override
	public List<Pets> ShowpetsByType(String TypesOfPets) throws SQLException, ClassNotFoundException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  Pets where  TypesOfPets=?";
		
		pst=connection.prepareStatement(cmd);
	
		pst.setString(1, TypesOfPets);
		ResultSet rs=pst.executeQuery();
	    List<Pets>petsList=new ArrayList<Pets>();
    while(rs.next()) {
    	    Pets pets= new Pets();
	
			
			pets.setPetID(rs.getInt("petID"));
			pets.setName(rs.getString("Name"));
			pets.setAge(rs.getInt("Age"));
			pets.setBreed(rs.getString("Breed"));
			pets.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
			pets.setTypesofpet(rs.getString("TypesOfPets"));
			petsList.add(pets);
		
		}
          return petsList;
	
	
	}

	@Override
	public List<Pets> ShowpetsByBreed(String Breed) throws ClassNotFoundException, SQLException {
		
		        String connStr = DBPropertyUtil.connectionString("db");
		        Connection connection = null;
		        PreparedStatement pst = null;
		        ResultSet rs = null;
		        List<Pets> petsList = new ArrayList<>();

		        try {
		            connection = DBConnUtil.GetConnection(connStr);
		            String cmd = "SELECT * FROM Pets WHERE Breed=?";
		            pst = connection.prepareStatement(cmd);
		            pst.setString(1, Breed);
		            rs = pst.executeQuery();

		            while (rs.next()) {
		                Pets pets = new Pets();
		                pets.setPetID(rs.getInt("petID"));
		                pets.setName(rs.getString("Name"));
		                pets.setAge(rs.getInt("Age"));
		                pets.setBreed(rs.getString("Breed"));
		                pets.setAvailableForAdoption(rs.getInt("AvailableForAdoption"));
		                pets.setTypesofpet(rs.getString("TypesOfPets"));
		                petsList.add(pets); // Add the Pets object to the list
		            }
		        } finally {
		            // Close resources in finally block to ensure they're always closed
		            if (rs != null) {
		                rs.close();
		            }
		            if (pst != null) {
		                pst.close();
		            }
		            if (connection != null) {
		                connection.close();
		            }
		        }
		        return petsList;
		    }

	@Override
	public Boolean AddPets(Pets pet) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		  String cmd = "INSERT INTO Pets (Name, Age, Breed, AvailableForAdoption, TypesOfPets) VALUES (?, ?, ?, ?, ?)";
          pst = connection.prepareStatement(cmd);
          Pets pet1=new Pets();
          pst.setString(1, pet1.getName());
          pst.setInt(2, pet1.getAge());
          pst.setString(3, pet1.getBreed());
          pst.setInt(4, pet1.getAvailableForAdoption());
          pst.setString(5, pet1.getTypesofpet());

          // Execute the insert statement
          int RowsInserted =pst.executeUpdate();
          if(RowsInserted>0) {
  			return true;
  		}
  		else {
  			return false;
  		}
		

		    
		      

	
		     
		
}
}
	
		

		
	


