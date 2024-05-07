package com.ilp03.asspart1;

import java.util.Arrays;
import java.util.Scanner;


public class InstitutionV2 {
	public static int index = 0;
	static int tierOneCount = 0;
	static int indianCount = 0;
	static String input;
	static String foundname;
	static int intinput;
	static String nameToFind;
	static String[] institution =new String[3]; ;
	static String[] country = new String[3];;
	static String[] tier = new String[3];
	static int[] courses = new int[3];
	static int[] newCourses = new int[3];

	// main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("welcome to the portal Admin");
		names();
		
		String[] newInstitution=backup();
		details();
		countIndian();
		countOne();

		System.out.println("Total number of Institutions: " + index);
		System.out.println("Total number of Tier one Institutions: " + tierOneCount);
		System.out.println("Total number of Indian Institutions: " + indianCount);
		System.out.println("The Highest course offered by an Institution is: " + findLargest(courses));
		System.out.println("The second Highest course offered by an Institution is: " + findsecondLargest(courses));
		System.out.println("The Lowest Number course offered by an Institution is: " + findSmallest(courses));
		System.out.println("The second Lowest Number of course offered by an Institution is:"+findsecSmallest(courses));
		System.out.println("type the name to find ");
		nameToFind = scanner.nextLine();
		searcher();
		order(institution,courses);
		
		ascOrder(newInstitution);
		
	}


	public static void names() {	    
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter names of Institutions(type 'exit' to finish):");

		while (true) {
			input = scanner.nextLine();
			if ("exit".equalsIgnoreCase(input)) {
				break;
			}
			institution[index] = input;
			

			index++;
		}
	}
	
	public static String[] backup() {
		String[] newInstitution = new String[index];
		newInstitution=institution;
		System.out.println(index);
		for(int i=0;i<index;i++) {
		System.out.println(newInstitution[i]);
		}
		return newInstitution;
		
		
	}
	
	public static void details() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("for each Institution enter the following details");
		for (int i = 0; i < index; i++) {
			scanner.nextLine();
			System.out.println("\n country of orgin of: " + institution[i]);

			input = scanner.nextLine();
			country[i] = input;

			System.out.println("\n Tier of: " + institution[i]);
			input = scanner.nextLine();
			tier[i] = input;

			System.out.println("\n number of courses offered by : " + institution[i]);
			intinput = scanner.nextInt();
			courses[i] = intinput;

		}

	}
	
	public static void countIndian() {

		// count Indian
		for (int j = 0; j < index; j++) {
			String conTemp = country[j];
			if ("india".equalsIgnoreCase(conTemp)) {
				indianCount++;
			}
		}
	}

	public static void countOne() {
		// count TierONe
		for (int k = 0; k < index; k++) {
			String TierTemp = tier[k];
			if ("one".equalsIgnoreCase(TierTemp)) {
				tierOneCount++;
			}
		}
	}

	public static int findLargest(int[] array) {
		int max = array[0]; // Assume first element is the max
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; // Update max if current element is larger
			}
		}
		return max; // Return the largest number
	}

	public static int findsecondLargest(int[] array) {
		int max = array[0];
		int secmax = array[0];// Assume first element is the max
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secmax = max;
				max = array[i]; // Update max if current element is larger
			}
		}
		return secmax; // Return the largest number
	}
	
	public static int findSmallest(int[] array) {
		int min = array[0];
		// Assume first element is the min [45	15	78]
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				
				min = array[i]; // Update min if current element is smaller
			
			}
		}
		
		return min; // Return the smallest number
	}

	public static int findsecSmallest(int[] array) {
		int min = array[0];
		int secmin = array[0];// Assume first element is the min [45	15	78]
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				secmin = min;
				min = array[i]; // Update min if current element is smaller
			
			}
		}
		
		return secmin; // Return the smallest number
	}
	
	public static String searcher() {


		String[] names = institution;

		boolean found = false;

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(nameToFind)) {
				System.out.println(nameToFind + " found at index: " + i);
				foundname = institution[i];
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println(nameToFind + " not found in the array.");
		}

		
		return foundname;
	}

	public static void order(String[]institution, int[]inlet)
{
	for(int index=0;index<inlet.length-1;index++) {
		for(int j=0;j<inlet.length-index-1;j++) {
			if(inlet[j]<inlet[j+1]) {
				int temp = inlet[j];
				inlet[j] = inlet[j+1];
				inlet[j+1] = temp;
				
				String tempCourse = institution[j];
				institution[j] = institution[j+1];
				institution[j+1] = tempCourse;
			}
		}
	}
	System.out.println("institution \t courses count");
	for(int i=0;i<inlet.length;i++)
	{
		System.out.println(institution[i]+"        "+inlet[i]);
	}
}


	public static void ascOrder(String[]newInstitution){
		 String tution[]=newInstitution;
		 String[] names=tution;
		 	           
        
    
		 
        // Sort the array in ascending order
         //Arrays.sort(names);
        
        // Display sorted array
		 System.out.print("Sorted array in ascending order: ");
         for(int u=0;u<index;u++) {
         System.out.print( names[u]+", ");
         }
	    }
	
}


