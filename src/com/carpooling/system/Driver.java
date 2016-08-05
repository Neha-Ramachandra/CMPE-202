package com.carpooling.system;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.carpooling.system.DriverModel;

public class Driver extends Member
{
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	//CSV file header
	private static final String FILE_HEADER = "id,name,phNumber,emailId,password,creditCardNumber,cvv,expirationDate,zipCode";
	 
	FileWriter fileWriter = null;
	String riderDetailsFile;

	Scanner input = new Scanner(System.in);
	DriverModel driverModel = new DriverModel();
	
	List<DriverModel> allDrivers = new ArrayList<DriverModel>();
	public void createMember()
	{
		
		try
		{
			
			 fileWriter = new FileWriter(riderDetailsFile);
			 fileWriter.append(FILE_HEADER.toString());
			 fileWriter.append(NEW_LINE_SEPARATOR);

			System.out.println("Please provide your emailid");
			driverModel.setEmailId(input.nextLine());
			
			System.out.println("Please provide your password");
			driverModel.setPassword(input.nextLine());
			
			System.out.println("Please provide your first name");
			driverModel.setFirstName(input.nextLine());
			
			System.out.println("Please provide your last name");
			driverModel.setLastName(input.nextLine());
			
			System.out.println("Please provide your contact number");
			driverModel.setPhNumber(input.nextInt());
			
			System.out.println("Please enter your city");
			driverModel.setCity(input.nextLine());
			
			System.out.println("Please enter type of vehicle: Personal/ Taxi");
			driverModel.setTypeOfVehicle(input.nextLine());
			
			System.out.println("Please provide your Account Number");
			driverModel.setAccountNumber(input.nextInt());
			
			System.out.println("Please provide your Car Insurance Number");
			driverModel.setCarInsuranceNumber(input.nextInt());
			
			System.out.println("Please provide your Car Registration Number;");
			driverModel.setCarRegistrationNumber(input.nextLine());
			
			System.out.println("Please provide your Driver License Number");
			driverModel.setDriverLicenseNumber(input.nextLine());
			
			allDrivers.add(driverModel);
			

			fileWriter.append(String.valueOf(driverModel));
			
			System.out.println("Thank You for registering! You are now a Member!");
			fileWriter.flush();
			fileWriter.close();
			
		}
		
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	 public void retrieveMember()
	 {
		 
	 }
	 public void updateMemberCredentials()
	 {
		 
	 }
	 public void deleteMember()
	 {
		 
	 }

}

