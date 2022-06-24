package com.prob2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		List<String> cityList = Arrays.asList("siwan","chapra","gopalganj","balia","pune");
		
		
	  Collections.sort(cityList,(str1,str2) ->str2.compareTo(str1));

		
//	  System.out.println(c);
	  
	  
	  for(String s:cityList) {
		   System.out.println("City name :" + s);
	  }
	  

	}

}
