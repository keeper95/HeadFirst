package com.headfirst.drumkit;

public class DrumKitTestDrive {

	public static void main(String[] args) {

		DrumKit drumKit = new DrumKit();

		if (drumKit.snare == true) {
			drumKit.playSnare();
			drumKit.playTopHat();
		}

	}

}
