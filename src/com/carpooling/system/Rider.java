package com.carpooling.system;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rider extends Member
{
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	//CSV file header
	private static final String FILE_HEADER = "id,name,phNumber,emailId,password,creditCardNumber,cvv,expirationDate,zipCode";

	FileWriter fileWriter = null;
	StringBuilder riderDetailsFile = new StringBuilder();

	Scanner input = new Scanner(System.in);


	List<RiderModel> allRiders = new ArrayList<RiderModel>();

	public void createMember() 
	{

		try
		{
			fileWriter = new FileWriter("riderDetailsFile",true);

			//fileWriter = new FileWriter(riderDetailsFile.toString(),true); 
			fileWriter = new FileWriter("C:\\Users\\neha\\Desktop\\riderDetailsFile.csv",true);

			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//get the last id in the line and then increment
			String lastId = "";
			String currentLine,lastLine;
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\neha\\Desktop\\riderDetailsFile.csv"));
			 while ((currentLine = br.readLine()) != null) 
			    {
			        //System.out.println(currentLine);
			        lastLine = currentLine;
			        String[] ary = lastLine.split(",");
				    lastId = ary[0];
			        
			    }
			 
			RiderModel riderModel = new RiderModel();
			int currentId = Integer.parseInt(lastId)+1;
			riderModel.setRiderId(currentId);
			System.out.println(currentId);

			System.out.println("Please provide your name");
			riderModel.setName(input.nextLine());
			
			System.out.println("Please provide your contact number");
			riderModel.setPhNumber(input.nextLong());
			
			System.out.println("Please provide your emailid");
			riderModel.setEmailId(input.nextLine());

			System.out.println("Please provide your password");
			riderModel.setPassword(input.nextLine());

			System.out.println("Please provide your Credit Card Number");
			riderModel.setCreditCardNumber(input.nextLong());

			System.out.println("Please provide your CVV");
			riderModel.setCvv(input.nextInt());

			System.out.println("Please provide your Expiration Date");
			riderModel.setExpirationDate(input.nextLine());

			System.out.println("Please provide your zip code");
			riderModel.setZipCode(input.nextLong());

			allRiders.add(riderModel);

			fileWriter.append(String.valueOf(riderModel));

			System.out.println("Thank You for registering! You are now a Member!");
			fileWriter.flush();
			fileWriter.close();


		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}

	}

	public void retrieveMember()
	{
		try
		{
			Scanner inputId = new Scanner(System.in);
			int riderIdForRetrieval;
			
			System.out.println("Please enter the rider id to fetch details");
			riderIdForRetrieval = inputId.nextInt();
			
			BufferedReader reader = new BufferedReader(new FileReader("riderDetailsFile.csv"));
			List<String> lines = new ArrayList<>();
			String line = null;
			while ((line = reader.readLine()) != null) {
			    lines.add(line);
			   
			    
			}
		
			//String[] ary = line.split(",");
		    //System.out.println(ary[0]);
		    
			//print individual columns of array
//			String[] columns = (String[]) lines.toArray();
//			System.out.println(columns[0]);
			
			System.out.println(lines.get(riderIdForRetrieval + 1));
			
			//prints the line given by index
			System.out.println("elements of a list are" +lines.get(1));
			reader.close();
			inputId.close();
		}
		
		catch(Exception e)
		{
			//System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	
	}
	public void updateMemberCredentials()
	{

	}
	public void deleteMember()
	{

	}

	public void requestRide()
	{

	}

	public void updateRide()
	{

	}

	public void cancelRide()
	{

	}


}
