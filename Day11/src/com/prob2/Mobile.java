package com.prob2;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	 void searchOutdatedModel(String compName , String... modelName ) {
		
		for(int i = 0; i<outdatedModels.length; i++) {
			for(int j = 0; j<modelName.length; j++) {
				if(outdatedModels[i].equals(modelName[j])) {
					System.out.println(modelName[j] + "_OUTDATED");
					break;
				}
			}
			
		}
		 
	 }
}

//Whenever you want to compare two string use .equals method instead of ==
