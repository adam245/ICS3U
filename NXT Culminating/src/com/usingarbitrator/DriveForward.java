package com.usingarbitrator;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior {
// drive forward method
	private boolean suppressed = false;
	
	@Override
	public boolean takeControl() {
		
		return true;
		
	}
	@Override
	public void action() {
		suppressed = false;
		Motor.B.forward();
		Motor.C.forward();
		while(!suppressed){
			Thread.yield();
		}
		Motor.B.stop();
		Motor.C.stop();
		}
	@Override
		public void suppress() {
			suppressed = true;
		}

}
