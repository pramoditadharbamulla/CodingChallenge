package com.java.PetPals.main;
import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.dao.*;
import com.java.PetPals.model.Shelters;

public class ShowSheltersMain {
	public static void main(String[] args) {
		SheltersDao dao = new SheltersDaoImpl();
		try {
			List<Shelters> SheltersList = dao.ShowShelters() ;
			for (Shelters shell : SheltersList) {
				System.out.println(shell);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
