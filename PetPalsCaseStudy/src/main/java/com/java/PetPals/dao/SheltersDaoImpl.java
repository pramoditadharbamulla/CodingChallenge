package com.java.PetPals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.PetPals.Util.DBConnUtil;
import com.java.PetPals.Util.DBPropertyUtil;
import com.java.PetPals.model.Pets;
import com.java.PetPals.model.Shelters;

public class SheltersDaoImpl implements SheltersDao{
	Connection connection;
	PreparedStatement pst;
	

	@Override
	public List<Shelters> ShowShelters() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  Shelters";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Shelters>sheltersList=new ArrayList<Shelters>();
		
		while(rs.next()) {
			
			Shelters shelter=new Shelters();
			shelter.setShelterID(rs.getInt("ShelterID"));
			shelter.setName(rs.getString("Name"));
			shelter.setLocation(rs.getString("Location"));
			sheltersList.add(shelter);
		}
		return sheltersList;
		
	}


	@Override
	public List<Shelters> ShowSheltersByLocation(String Location) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  Shelters where Location=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Location);
		ResultSet rs=pst.executeQuery();
		List<Shelters>sheltersList=new ArrayList<Shelters>();
	while(rs.next()) {
			
			Shelters shelter=new Shelters();
			shelter.setShelterID(rs.getInt("ShelterID"));
			shelter.setName(rs.getString("Name"));
			shelter.setLocation(rs.getString("Location"));
			sheltersList.add(shelter);
		}
		return sheltersList;
		
	}


	@Override
	public Shelters ShowsheltersByID(int ShelterID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd="select * from  Shelters where ShelterID=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, ShelterID);
		ResultSet rs=pst.executeQuery();
		Shelters shelter=new Shelters();
		
	while(rs.next()) {
			
		
			shelter.setShelterID(rs.getInt("ShelterID"));
			shelter.setName(rs.getString("Name"));
			shelter.setLocation(rs.getString("Location"));
			
		}
		return  shelter;
		
		
	}


	@Override
	public Boolean AddShelters(Shelters shelter) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		 String cmd = "INSERT INTO Shelters(ShelterID,Name,Location) VALUES (?, ?, ?)";
		 pst = connection.prepareStatement(cmd);
         Shelters shelter1= new Shelters();
         pst.setInt(1,shelter1.getShelterID());
         pst.setString(2,shelter1.getName());
		 pst.setString(3, shelter1.getLocation());
		  int RowsInserted =pst.executeUpdate();
          if(RowsInserted>0) {
  			return true;
  		}
  		else {
  			return false;
  		}
		
		
	}
		
	}
	


