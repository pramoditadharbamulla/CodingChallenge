package com.java.PetPals.main;

import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.dao.PetsDao;
import com.java.PetPals.dao.PetsDaoImpl;
import com.java.PetPals.model.Pets;

public class ShowPetsMain {
    public static void main(String[] args) {
        PetsDao dao = new PetsDaoImpl();
        try {
            List<Pets> petsList = dao.Showpets();
            for (Pets pets : petsList) {
                System.out.println(pets);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

