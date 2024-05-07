package com.ilp03.services;

import java.util.Scanner;

import com.ilp03.entity.Institution;

public class InstitutionService {

	public static Institution createInstitution() {
		Institution institution = new Institution();
		Scanner scanner = new Scanner(System.in);
		System.out.println("****Enter Institution details****");
		System.out.println("institution ID -:");
		int institutionID = scanner.nextInt();
		System.out.println(" institution Name-:");
		scanner.nextLine();
		String institutionName = scanner.nextLine();

		System.out.println("course Count:");
		int courseCount = scanner.nextInt();
		System.out.println("rank-:");
		int rank = scanner.nextInt();

		institution.setInstitutionID(institutionID);
		institution.setInstitutionName(institutionName);
		institution.setCourseCount(courseCount);
		institution.setRank(rank);

		return institution;
	}

	public static void displayInstitution(Institution institution) {
		System.out
				.println("Institution ID:" + "  " + "Institution Name:" + " " + "Course count:" + " " + "Rank:" + "  ");

		System.out.println(institution.getInstitutionID() + "		 " + institution.getInstitutionName() + "	  	"
				+ institution.getCourseCount() + "	    	" + institution.getRank());

	}

}
