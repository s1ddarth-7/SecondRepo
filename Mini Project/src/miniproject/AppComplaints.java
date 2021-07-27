package miniproject;

import java.util.*;

public class AppComplaints {
	
	public static void main(String[] args) {
		
		ComplaintTypes fetch= new ComplaintTypes();
		fetch.loadData();
		
		System.out.println("Enter your option between 1 to 4");
		System.out.println("1.Display complaints based on the year provided by the user ");
		System.out.println("2.Display complaints based on the name of the company provided by the user");
		System.out.println("3.Display complaints based on the complaint id provided by the user ");
		System.out.println("4.Display all the complaints closed/closed with explanation ");
		System.out.println("5.Display all the complaints which received a timely response ");
		Scanner sc=new Scanner(System.in);
		
		int option=sc.nextInt();
		sc.nextLine();
		
		switch(option)
		{
		case 1: 
			System.out.println("Enter year");
			String year=sc.next();
			fetch.YearBased(year);
			break;
		
		case 2:
			System.out.println("Enter company name");
		    String name=sc.next(); 
			fetch.CompanyBased(name);
			break;
		
		case 3: 
			System.out.println("Enter complaint ID");
			String id=sc.next();
			fetch.IdBased(id);
			break;
		
		case 4: 
			fetch.ClosedBased();
			break;
			
		case 5:
			fetch.TimelyBased();
			break;
		
		default: System.out.println("Enter valid option");
		
		}
		sc.close();
		
	}

}
