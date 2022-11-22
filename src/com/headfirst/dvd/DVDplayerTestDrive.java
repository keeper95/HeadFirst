package com.headfirst.dvd;

public class DVDplayerTestDrive {

	public static void main(String[] args) {
		
		DVDplayer dvdPlayer = new DVDplayer();
		
		dvdPlayer.canRecord = true;
		dvdPlayer.playDVD();
		
		if (dvdPlayer.canRecord == true) {
			dvdPlayer.recordDVD();
		}
	}

}
