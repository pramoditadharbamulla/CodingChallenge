package com.java.PetPals.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.model.Shelters;

public interface SheltersDao {
	List<Shelters>ShowShelters() throws ClassNotFoundException, SQLException;
	List<Shelters>ShowSheltersByLocation(String Location) throws ClassNotFoundException, SQLException;
	Shelters  ShowsheltersByID(int ShelterID) throws ClassNotFoundException, SQLException;
	Boolean AddShelters(Shelters shelter) throws ClassNotFoundException, SQLException;

}
