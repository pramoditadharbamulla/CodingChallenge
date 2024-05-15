package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.dao.*;

import com.java.PetPals.model.AdoptionEvents;

public class ShowAdoptionMain {
	public static void main(String[] args) {
		AdoptionEventsDao dao= new AdoptionsDaoImpl();
		try {
			List<AdoptionEvents> AdoptionsList = dao.showAdoptionEvents() ;
			for (AdoptionEvents Adopt : AdoptionsList) {
				System.out.println(Adopt);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}


