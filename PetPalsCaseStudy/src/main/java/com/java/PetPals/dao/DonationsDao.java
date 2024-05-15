package com.java.PetPals.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.PetPals.model.Donations;

public interface DonationsDao {
	List<Donations> ShowDonations() throws ClassNotFoundException, SQLException;
	List<Donations>ShowDonationsByDonarName(String DonarName) throws ClassNotFoundException, SQLException;
	void AddDonations(Donations Donation) throws SQLException, ClassNotFoundException;
	 Boolean updateDonationsItem(String DonationItem, int DonationId) throws ClassNotFoundException, SQLException;
	 List<Donations> getDonationsDateRange(Date startDate, Date endDate) throws ClassNotFoundException, SQLException;
	

}
