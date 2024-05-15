package com.java.PetPals.model;

public class Pets {
	private int petID;
	private String name;
	
    private int age;
    private String breed;
	private String typesofpet;
	private  int AvailableForAdoption;
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getTypesofpet() {
		return typesofpet;
	}
	public void setTypesofpet(String typesofpet) {
		this.typesofpet = typesofpet;
	}
	public int getAvailablrForAdoption() {
		return AvailableForAdoption;
	}
	public void setAvailableForAdoption(int availableForAdoption) {
		AvailableForAdoption = availableForAdoption;
	}
	@Override
	public String toString() {
		return "PetsModel [petID=" + petID + ", name=" + name + ", age=" + age + ", breed=" + breed + ", typesofpet="
				+ typesofpet + ", AvailableForAdoption=" + AvailableForAdoption + "]";
	}
	public Pets(int petID, String name, int age, String breed, String typesofpet, int availableForAdoption) {
		super();
		this.petID = petID;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.typesofpet = typesofpet;
		AvailableForAdoption = availableForAdoption;
	}
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAvailableForAdoption() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
