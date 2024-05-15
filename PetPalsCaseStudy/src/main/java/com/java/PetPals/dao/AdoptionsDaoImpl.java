package com.java.PetPals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.PetPals.Util.DBConnUtil;
import com.java.PetPals.Util.DBPropertyUtil;
import com.java.PetPals.model.AdoptionEvents;

public class AdoptionsDaoImpl  implements AdoptionEventsDao{
	Connection connection;
	PreparedStatement pst;
	@Override
	public List<AdoptionEvents> showAdoptionEvents() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from AdoptionEvents";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<AdoptionEvents> AdoptionEventsList = new ArrayList<AdoptionEvents>();
		AdoptionEvents Adopt = null;
		while(rs.next()) {
			Adopt = new AdoptionEvents();
			Adopt.setEventID(rs.getInt("EventID"));
			Adopt.setEventName(rs.getString("EventName"));
			Adopt.setDate(rs.getDate("EventDate"));
			Adopt.setLocation(rs.getString("Location"));
			
			AdoptionEventsList.add(Adopt);
		}
		return AdoptionEventsList;
	}
	@Override
	public Boolean CreateAdoptionEvents(AdoptionEvents adoptionevents) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "Insert Into AdoptionEvents (EventID, EventName, EventDate, Location)Values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,adoptionevents.getEventID());
		pst.setString(2,adoptionevents.getEventName());
		pst.setDate(3,adoptionevents.getDate());
		pst.setString(4,adoptionevents.getLocation());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}

}
}
