package com.java.PetPals.dao;
import com.java.PetPals.model.*;

import java.sql.SQLException;
import java.util.List;

public interface AdoptionEventsDao {
	List<AdoptionEvents> showAdoptionEvents() throws ClassNotFoundException, SQLException;
	Boolean CreateAdoptionEvents(AdoptionEvents adoptionevents) throws ClassNotFoundException, SQLException;

}
