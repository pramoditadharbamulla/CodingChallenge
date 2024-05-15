package com.java.PetPals.model;
import java.sql.Date;

public class AdoptionEvents {
	private int EventID ;
	private String EventName ;
	private Date Date;
	private String Location;
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "AdoptionEventsModel [EventID=" + EventID + ", EventName=" + EventName + ", Date=" + Date + ", Location="
				+ Location + "]";
	}
	public AdoptionEvents(int eventID, String eventName, java.sql.Date date, String location) {
		super();
		EventID = eventID;
		EventName = eventName;
		Date = date;
		Location = location;
	}
	public AdoptionEvents() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
