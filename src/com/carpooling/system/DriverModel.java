package com.carpooling.system;

public class DriverModel 
{
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private int phNumber;
	private String city;
	private String typeOfVehicle;// : Personal/Taxi
	private int SSN;
	private int accountNumber;
	private int carInsuranceNumber;
	private String carRegistrationNumber;
	private String driverLicenseNumber;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCarInsuranceNumber() {
		return carInsuranceNumber;
	}
	public void setCarInsuranceNumber(int carInsuranceNumber) {
		this.carInsuranceNumber = carInsuranceNumber;
	}
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	
	@Override
	public String toString() 
	{
		/*return "DriverModel [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phNumber=" + phNumber + ", city=" + city + ", typeOfVehicle=" + typeOfVehicle + ", SSN="
				+ SSN + ", accountNumber=" + accountNumber + ", carInsuranceNumber=" + carInsuranceNumber
				+ ", carRegistrationNumber=" + carRegistrationNumber + ", driverLicenseNumber=" + driverLicenseNumber
				+ "]";*/
		
		return  emailId + "," + password + "," + firstName + "," + lastName + "," + phNumber + "," + city + "," + typeOfVehicle + ","
		+ SSN + "," + accountNumber + "," + carInsuranceNumber
		+ "," + carRegistrationNumber + "," + driverLicenseNumber;
	}

}
