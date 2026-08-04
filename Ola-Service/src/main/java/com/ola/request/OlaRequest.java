package com.ola.request;

public class OlaRequest 
{
	   private String customerName;
	   private String pickupLocation;
	   private String dropLocation;
	   private String vehicleType;
	   private double fare;
	   private String bookingStatus;
	   public String getCustomerName() {
		   return customerName;
	   }
	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }
	   public String getPickupLocation() {
		   return pickupLocation;
	   }
	   public void setPickupLocation(String pickupLocation) {
		   this.pickupLocation = pickupLocation;
	   }
	   public String getDropLocation() {
		   return dropLocation;
	   }
	   public void setDropLocation(String dropLocation) {
		   this.dropLocation = dropLocation;
	   }
	   public String getVehicleType() {
		   return vehicleType;
	   }
	   public void setVehicleType(String vehicleType) {
		   this.vehicleType = vehicleType;
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
