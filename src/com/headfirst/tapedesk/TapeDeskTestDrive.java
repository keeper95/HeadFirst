package com.headfirst.tapedesk;

public class TapeDeskTestDrive {

	public static void main(String[] args) {
		
		TapeDesk tapeDesk = new TapeDesk();
		
		tapeDesk.canRecord = true;
		tapeDesk.playType();
		
		if (tapeDesk.canRecord == true) {
			tapeDesk.recordType();
		}

	}

}
