package com.ola.response;

public class OlaResponse 
{
	   private int serviceId;
	   private String driverName;
	   private double fare;
	   private String bookingStatus;
	   
	   public int getServiceId() {
		   return serviceId;
	   }
	   public void setServiceId(int serviceId) {
		   this.serviceId = serviceId;
	   }
	   public String getDriverName() {
		   return driverName;
	   }
	   public void setDriverName(String driverName) {
		   this.driverName = driverName;
	   }
	   public double getFare() {
		   return fare;
	   }
	   public void setFare(double fare) {
		   this.fare = fare;
	   }
	   public String getBookingStatus() {
		   return bookingStatus;
	   }
	   public void setBookingStatus(String bookingStatus) {
		   this.bookingStatus = bookingStatus;
	   }
         
	   
}
