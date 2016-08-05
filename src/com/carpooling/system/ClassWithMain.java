package com.carpooling.system;

import java.util.Scanner;

public class ClassWithMain 
{
	Member member;
	Parking parking ;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ClassWithMain c1 = new ClassWithMain();
		

		System.out.println("Hello! Welcome to PIK Carpooling System!");

		System.out.println("Press 1 to become member");
		System.out.println("Press 2 to retrieve member details");
		System.out.println("Press 3 to update member info");
		System.out.println("Press 4 to withdraw membership");
		System.out.println("Press 5 to list all parking slots");
		System.out.println("Press 6 to search for vacant slots");
		System.out.println("Press 0 to exit");
		c1.decideClass();
	}

	public void decideClass()
	{
		try
		{
			int choice;
			String answer;
			parking = new Parking();
			System.out.println("Please enter your choice");
			Scanner input = new Scanner(System.in);
			Scanner inputAnswer = new Scanner(System.in);
			//			BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
			choice = input.nextInt();

			switch(choice)
			{
			case 1: System.out.println("Do you want to register as a rider or a driver?");
			answer = inputAnswer.nextLine();


			if(answer.toLowerCase().equals("rider"))
			{
				member = new Rider();
				member.createMember();
			}
			else if(answer.toLowerCase().equals("driver"))
			{
				member = new Driver();
				member.createMember();
			}
			else
			{
				System.out.println("please provide valid input");
			}

			break;

			case 2: System.out.println("Do you want to retrieve the details of a member by id? Please enter yes or no.");
			answer = inputAnswer.nextLine();

			if(answer.toLowerCase().equals("yes"))
			{
				System.out.println("Enter R To retrive the details by id of rider");
				System.out.println("Enter D To retrive the details by id of driver");
				char ch = input.next().charAt(0);
				if(ch == 'R')
				{
					member = new Rider();
					member.retrieveMember();
				}
				else if(ch == 'D')
				{
					member = new Driver();
					member.retrieveMember();
				}
				else
				{
					System.out.println("Press 1 to become member");
					System.out.println("Press 2 to retrieve member details");
					System.out.println("Press 3 to update member info");
					System.out.println("Press 4 to withdraw membership");
					decideClass();
				}
			}
			else
			{
				System.out.println("Thank You!");
				System.out.println("Press 1 to become member");
				System.out.println("Press 2 to retrieve member details");
				System.out.println("Press 3 to update member info");
				System.out.println("Press 4 to withdraw membership");
				decideClass();
			}
			break;

			case 5: System.out.println("Please do parking");
			parking.listAllSlots();
			break;
			
			case 6: parking.searchVacantSlot();
			
			case 0: System.out.println("Press 1 to become member");
			System.out.println("Press 2 to retrieve member details");
			System.out.println("Press 3 to update member info");
			System.out.println("Press 4 to withdraw membership");
			decideClass();
			break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}


	}
}
