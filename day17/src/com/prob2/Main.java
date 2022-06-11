package com.prob2;

public class Main {

	public static void main(String[] args) {
	
		
		PlayList p1 = new PlayList();
     
		p1.addSong(new Song("mohabbatein"));
		p1.addSong(new Song("Slowly"));
		p1.addSong(new Song("Kahaani"));
		p1.addSong(new Song("don"));
		p1.addSong(new Song("don"));


		
		for(Song s:p1.songs) {

			System.out.println(s.getSong());

			System.out.println("Song added to playlist");
		}
		
		
		
	}

}
