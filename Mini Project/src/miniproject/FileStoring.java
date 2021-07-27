package miniproject;

import java.io.*;
import java.util.*;
public class FileStoring {

	HashMap <String, Details> MapComp = new HashMap<>();
	public void fileLoader() 
	{

	// ArrayList<String> objcompdetOfBanks=new ArrayList<>();
	 String path="C:\\Users\\Siddarth Prabhakaran\\Downloads\\Mini project\\complaints.csv";
	 String line="";
	 
	 try {
		BufferedReader buf=new BufferedReader(new FileReader(path));
		while ((line=buf.readLine())!=null)
		{   
			
			String[] elements=line.split(",");
			Details det=new Details();
			det.dateReceived=elements[0];
			det.product=elements[1];
			det.subproduct=elements[2];
			det.issue=elements[3];
			det.subissue=elements[4];
			det.company=elements[5];
			det.state=elements[6];
			det.zip=elements[7];
			det.subvia=elements[8];
			det.dateSent=elements[9];
			det.compResp=elements[10];
			det.timeResp=elements[11];
			det.consDispute=elements[12];
			det.cid=elements[13];
			
			MapComp.put(elements[13],det); 
		}
		buf.close();
		
	} 
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}

	HashMap<String,Details> GetMapComp(){
		
		return MapComp;
		
	}
	
}
