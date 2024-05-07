package com.ilp03.asspart1;

import java.util.Scanner;

public class Institution{

	// main
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int index = 0;
		        int tierOneCount=0;
		        int indianCount=0;
		        String input;
		        String[] institution = new String[100];
		        String[] country = new String[100];
		        String[] tier = new String[100];
		        System.out.println("welcome to the portal Admin");
		        
		        
	//entering name of institutions
		        System.out.println("Enter names of Institutions(type 'exit' to finish):");
		        
		        while (true) {
		            input = scanner.nextLine();
	             if ("exit".equalsIgnoreCase(input)) {
		                break;
		            }
	             institution[index]=input;

		            index++;
		        	}
		        
		        
		        
	//enter details	        
		        
		        System.out.println("for each Institution enter the following details");
		        for(int i=0;i<index;i++) 
		        {
		        	System.out.println("\n country of orgin of: "+ institution[i]);
		        	input = scanner.nextLine();
		        	country[i]=input;
		        	
		        	System.out.println("\n Tier of: "+ institution[i]);
		        	input = scanner.nextLine();
		        	tier[i]=input;
		        	
		        }
		        scanner.close();
		        
		        
	//count Indian 
		        for(int j=0;j<index;j++)
		        {
		        	String conTemp=country[j];
	             if ("india".equalsIgnoreCase(conTemp)) {
	            	 indianCount++;
	            	 }
		        	}
	//count TierONe 
		        for(int k=0;k<index;k++)
		        {
		        	String TierTemp=tier[k];
	             if ("one".equalsIgnoreCase(TierTemp)) {
	            	 tierOneCount++;
	            	 }
		        	}

		       
	//results	        
		       
		        System.out.println("Total number of Institutions: " + index);
		        System.out.println("Total number of Tier one Institutions: " + tierOneCount);
		        System.out.println("Total number of Indian Institutions: " + indianCount);
		        
		        
		        
}

}
