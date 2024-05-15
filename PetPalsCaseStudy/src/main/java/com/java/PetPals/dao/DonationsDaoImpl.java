package com.java.PetPals.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.PetPals.Util.DBConnUtil;
import com.java.PetPals.Util.DBPropertyUtil;
import com.java.PetPals.model.Donations;

public class DonationsDaoImpl  implements DonationsDao{
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Donations> ShowDonations() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		List<Donations> donationsList = new ArrayList<>();
		 String cmd = "SELECT * FROM Donations";
         pst = connection.prepareStatement(cmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Donations donation = new Donations();
            donation.setDonationID(rs.getInt("DonationID"));
            donation.setDonarName(rs.getString("DonarName"));
            donation.setDonationType(rs.getString("DonationType"));
            donation.setDonationAmount(rs.getDouble("DonationAmount"));
            donation.setDonationItem(rs.getString("DonationItem"));
            donation.setDonationDate(rs.getDate("DonationDate"));
            donationsList.add(donation);
        }
        return donationsList;
		
		
	}

	@Override
	public List<Donations> ShowDonationsByDonarName(String DonarName) throws ClassNotFoundException, SQLException {
		
		        String connStr = DBPropertyUtil.connectionString("db");
		        Connection connection = null;
		        PreparedStatement pst = null;
		        ResultSet rs = null;
		        List<Donations> donationsList = new ArrayList<>();

		     
		            connection = DBConnUtil.GetConnection(connStr);
		            String cmd = "SELECT * FROM Donations WHERE DonarName=?";
		            pst = connection.prepareStatement(cmd);
		            pst.setString(1, DonarName);
		            rs = pst.executeQuery();

		            while (rs.next()) {
		                Donations donation = new Donations();
		                donation.setDonationID(rs.getInt("DonationID"));
		                donation.setDonarName(rs.getString("DonarName"));
		                donation.setDonationType(rs.getString("DonationType"));
		                donation.setDonationAmount(rs.getDouble("DonationAmount"));
		                donation.setDonationItem(rs.getString("DonationItem"));
		                donation.setDonationDate(rs.getDate("DonationDate"));
		                donationsList.add(donation);
		            }
		        
		        return donationsList;
	}

	@Override
	public void AddDonations(Donations Donation) throws SQLException, ClassNotFoundException {
		

String cmd = "INSERT INTO Donations(DonationID, DonarName, DonationType, DonationAmount, DonationItem, DonationDate) "
           + "VALUES(?, ?, ?, ?, ?, ?)";
PreparedStatement pstmt = connection.prepareStatement(cmd);
String connStr = DBPropertyUtil.connectionString("db");
connection = DBConnUtil.GetConnection(connStr);
Donations ds= new Donations();
pstmt.setInt(1,ds.getDonationID() );
pstmt.setString(2, ds.getDonarName());
pstmt.setString(3, ds.getDonationType());
pstmt.setDouble(4, ds.getDonationAmount());
pstmt.setString(5, ds.getDonationItem());
pstmt.setDate(6, ds.getDonationDate());
pstmt.executeUpdate();
}

	@Override
	public Boolean updateDonationsItem(String DonationItem, int DonationId) throws ClassNotFoundException, SQLException {
		
			String connStr = DBPropertyUtil.connectionString("DB");
			connection = DBConnUtil.GetConnection(connStr);
			String  cmd="update Donations set DonationItem=? where DonationId=? ";
			pst=connection.prepareStatement(cmd);
			pst.setString(1, DonationItem);
			pst.setInt(2, DonationId);
			
		
			int RowsInserted=pst.executeUpdate();
			if(RowsInserted>0) {
				return true;
			}
			else {
				return false;
			}


	}

	@Override
	public List<Donations> getDonationsDateRange(Date startDate, Date endDate) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd ="select * from Donations where DonationDate between ? and ? ";
		
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, startDate);
		pst.setDate(2, endDate);
		
		ResultSet rs=pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonarName(rs.getString("DonorName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDate(rs.getDate("DonationDate"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	} 

	

}

