package com.java.PetPals.model;

import java.sql.Date;

public class Donations {
	
			private int  DonationID ;
			private String DonarName;
			private String DonationType;
		    private double DonationAmount ;
			private String DonationItem ;
		    private Date DonationDate;
			public int getDonationID() {
				return DonationID;
			}
			public void setDonationID(int donationID) {
				DonationID = donationID;
			}
			public String getDonarName() {
				return DonarName;
			}
			public void setDonarName(String donarName) {
				DonarName = donarName;
			}
			public String getDonationType() {
				return DonationType;
			}
			public void setDonationType(String donationType) {
				DonationType = donationType;
			}
			public double getDonationAmount() {
				return DonationAmount;
			}
			public void setDonationAmount(double donationAmount) {
				DonationAmount = donationAmount;
			}
			public String getDonationItem() {
				return DonationItem;
			}
			public void setDonationItem(String donationItem) {
				DonationItem = donationItem;
			}
			public Date getDonationDate() {
				return DonationDate;
			}
			public void setDonationDate(Date donationDate) {
				DonationDate = donationDate;
			}
			@Override
			public String toString() {
				return "Donations [DonationID=" + DonationID + ", DonarName=" + DonarName + ", DonationType="
						+ DonationType + ", DonationAmount=" + DonationAmount + ", DonationItem=" + DonationItem
						+ ", DonationDate=" + DonationDate + "]";
			}
			public Donations(int donationID, String donarName, String donationType, double donationAmount,
					String donationItem, Date donationDate) {
				super();
				DonationID = donationID;
				DonarName = donarName;
				DonationType = donationType;
				DonationAmount = donationAmount;
				DonationItem = donationItem;
				DonationDate = donationDate;
			}
			public Donations() {
				super();
				// TODO Auto-generated constructor stub
			}
		    


}
