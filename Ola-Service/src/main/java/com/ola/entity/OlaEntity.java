package com.ola.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="ola_booking")
public class OlaEntity 
{
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   
   private int serviceId;
   private String customerName;
   private String driverName;
   private String pickupLocation;
   private String dropLocation;
   private String vehicleType;
   private double fare;
   private String bookingStatus;
   public int getServiceId() {
	return serviceId;
   }
   public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
   }
   public String getCustomerName() {
	return customerName;
   }
   public void setCustomerName(String customerName) {
	this.customerName = customerName;
   }
   public String getDriverName() {
	return driverName;
   }
   public void setDriverName(String driverName) {
	this.driverName = driverName;
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
