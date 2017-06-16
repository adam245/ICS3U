package com.usingarbitrator;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Endprogram implements Behavior {
// end program method
	@Override
	public boolean takeControl() {
		return Button.ESCAPE.isDown();
	
	}

	@Override
	public void action() {
		System.exit(0);
		
	}

	@Override
	public void suppress() {
		
		
	}

}
