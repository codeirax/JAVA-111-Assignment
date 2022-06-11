package com.prob2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {

	
	double bonus(String joindate) throws InvalidAgeException {
		
		try {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate currDate = LocalDate.now();
			LocalDate joinDate = LocalDate.parse(joindate,dtf);
			
			if(joinDate.isAfter(currDate)) {
				throw new InvalidAgeException();
			}
			
			long experienced = ChronoUnit.YEARS.between( joinDate,currDate);
			
			if(experienced < 1) {
				return 5000;
			}
			else if(experienced < 1 || experienced < 2) {
				return 8000;
			}else {
				return 10000;
			}
			
		}
		catch (InvalidAgeException e) {
			throw new  InvalidAgeException("Date should not be in future");
		}
		catch(DateTimeParseException dtpe) {
			throw new InvalidAgeException("Please pass the date in the correct format");
		}
		
	}
}
