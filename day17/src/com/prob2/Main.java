package com.prob2;


import java.util.LinkedHashSet;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		Set<Song> lhs = new LinkedHashSet<>();
				
		PlayList p1 = new PlayList();
     
		p1.addSong(new Song("mohabbatein"));
		p1.addSong(new Song("Slowly"));
		p1.addSong(new Song("Kahaani"));
		p1.addSong(new Song("don"));

		p1.addSong(new Song("don"));
		
	
		for(Song s:p1.songs) {
			
			lhs.add(s);
			
        }
	  
	
	for(Song h:lhs) {
		
		System.out.println(h.getSong());
		System.out.println("Song added to playlist");
		
	}
		
	
	
	
	}

}
