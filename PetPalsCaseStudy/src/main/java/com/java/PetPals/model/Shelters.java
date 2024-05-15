package com.java.PetPals.model;

public class Shelters {
 private int ShelterID ;
private String Name ;
private String	Location ;
public int getShelterID() {
	return ShelterID;
}
public void setShelterID(int shelterID) {
	ShelterID = shelterID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
@Override
public String toString() {
	return "Shelters [ShelterID=" + ShelterID + ", Name=" + Name + ", Location=" + Location + "]";
}
public Shelters(int shelterID, String name, String location) {
	super();
	ShelterID = shelterID;
	Name = name;
	Location = location;
}
public Shelters() {
	super();
	// TODO Auto-generated constructor stub
}


}
