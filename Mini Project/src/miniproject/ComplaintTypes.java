package miniproject;

import java.util.*;
public class ComplaintTypes {

	FileStoring compfile= new FileStoring();
	Scanner sc=new Scanner(System.in);

	void loadData()
	{
		compfile.fileLoader();
	}

	void YearBased(String year)
	{
		for (HashMap.Entry<String,Details> row :compfile.GetMapComp().entrySet()) 
		{
			if(row.getValue().dateReceived.contains(year))
				  { 
			  		System.out.println(row.getValue().issue);
				  }
		}
		
	}
	
	
	void CompanyBased(String company)
	{
		for (HashMap.Entry<String,Details> row :compfile.GetMapComp().entrySet()) 
		{
			if(row.getValue().company.contains(company))
				  { 
			  		System.out.println(row.getValue().issue);
				  }
		}
		
	}
	
	
	void IdBased(String id)
	{
		boolean flag=false;
		for (HashMap.Entry<String,Details> row :compfile.GetMapComp().entrySet()) 
		{
			if(row.getValue().cid.contains(id))
				  { 
					System.out.println(row.getValue().issue);
					flag=true;
				  }
		}
		if (flag==false)
		{
			System.out.println("Invalid ID");
		}
		
	}
	
	
	void ClosedBased()
	{
		String resp="";
		for (HashMap.Entry<String,Details> row :compfile.GetMapComp().entrySet()) 
		{
			resp=row.getValue().compResp;
			if(resp.equalsIgnoreCase("closed") || resp.equalsIgnoreCase("closed with explanation"))
				  {
			  		System.out.println("Date submitted: "+ row.getValue().dateSent+" Issue: "+ row.getValue().issue);
				  }
		}
		
	}
	
	void TimelyBased()
	{
		String resp="";
		for (HashMap.Entry<String,Details> row :compfile.GetMapComp().entrySet()) 
		{
			resp=row.getValue().timeResp;
			if(resp.equalsIgnoreCase("yes"))
				  {
			  		System.out.println("Date submitted: "+ row.getValue().dateSent+" Issue: "+ row.getValue().issue);
				  }
		}
		
	}
	
}
