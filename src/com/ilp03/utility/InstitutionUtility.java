package com.ilp03.utility;

import com.ilp03.entity.Institution;
import com.ilp03.services.InstitutionService;

public class InstitutionUtility {
	public static void main(String[] args) {
		Institution institution = InstitutionService.createInstitution();
		InstitutionService.displayInstitution(institution);
	}

}
