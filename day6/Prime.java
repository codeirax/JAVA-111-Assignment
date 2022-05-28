package com.day6;

public class Prime {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
         
		 int empty[] = new int[0];  
		 int newarr[] = new int[inputArray.length + 1];  // declaring array
		 
		for(int i = 0; i<inputArray.length; i++) {
		  // check prime for every number
			if(primeCheck(inputArray[i])) {
				newarr[i] = inputArray[i];   // checking prime
				
			}
			
		}
		
		
         if(newarr.length>0) {
//         
        	 return newarr;
         }else {
        	 return empty;     // ? return empty array 
         }
	}
	
	// Checking prime whether it 's true false;
	
static boolean primeCheck(int x){

       int count  = 0;
       
       for(int i = 1; i<=x; i++) {
    	   if(x % i == 0) {
    		   count++;
    	   }
       }
       if(count == 2) {
    	   return true;
       }else {
    	   return false;
       }
	}
 
 
 
	
public static void main(String[] args) {
	
	Prime p1 = new Prime();
	int[] arr = {10,12,5,50,11,14,15};

	int[] arr2 = {};
	int[] result = p1.findAndReturnPrimeNumbers(arr);
	   
	if(result.length == 0) {
		System.out.println("Prime number not found in the supplied Array");
	}
	else {
		for(int i: result) {
			System.out.println(i);
		}
	}

	

}






}
