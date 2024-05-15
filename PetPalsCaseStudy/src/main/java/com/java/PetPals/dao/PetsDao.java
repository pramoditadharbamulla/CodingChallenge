package com.java.PetPals.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.model.Pets;

public interface PetsDao {
	List<Pets>Showpets() throws ClassNotFoundException, SQLException;
	Pets ShowPetsByID(int PetID) throws ClassNotFoundException, SQLException;
	List<Pets>ShowpetsByType(String TypesOfPets) throws SQLException, ClassNotFoundException ;
	List<Pets>ShowpetsByBreed(String Breed) throws ClassNotFoundException, SQLException;
	Boolean AddPets(Pets pet) throws ClassNotFoundException, SQLException;

}
