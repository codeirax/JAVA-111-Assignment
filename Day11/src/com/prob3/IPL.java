package com.prob3;

import java.util.Scanner;

public class IPL {

void homeTeamStadium(Stadium stadium){
	
	
    
	  switch (stadium) {
	case EDEN_GARDENS_STADIUM:
		System.out.println("This is the home ground of KKR");
		
		break;
	case CHIDAMBARAM_STADIUM:
		System.out.println("This is the home ground of CSK");
		break;
	case M_CHINNASWAMY_STADIUM :
		  System.out.println("This is the home ground of RCB");
		  break;
		  
	case  WANKHEDE_STADIUM:
		System.out.println("This is the home ground of Mumbai Indians");
		break;
	default:
		System.out.println("Please Enter valid Name");
	}
	
}
	
}
