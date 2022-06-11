package com.prob1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	
public static void main(String[] args) {
	
	Set<Song> songList = new LinkedHashSet<Song>();
	
	Song s1 = new Song("Mohabbatein", "Mohabbatein");
	Song s2 = new Song("Mohabbatein", "Mohabbatein");
	Song s3  = new Song("Dilwale","Dilwale");
	Song s4  = new Song("Dilwale","Dilwale");
	
	songList.add(s1);
	songList.add(s2);  // duplicate passing but it won't print.
	songList.add(s3);
	songList.add(s4);  // duplicate passing but it won't print.
	
	for(Song s:songList) {
		s.play();
	}
	
	
	// Showing duplicate object 
 System.out.println("s1 and s2 is duplicate : " + s1.equals(s2 )+ " so one will be remove from here");
	

	
	
  }
}
