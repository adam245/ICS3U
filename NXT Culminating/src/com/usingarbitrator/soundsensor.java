package com.usingarbitrator;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

public class soundsensor implements Behavior {
private boolean suppressed;
	@Override
	//stops the robot and makes it spin
	public boolean takeControl() {
		// when sound is more than 30 the robot spins
		SoundSensor sound = new SoundSensor(SensorPort.S2,true);
		sound.readValue();
		if(sound.readValue()> 30){
			return true;
		}
		
		return false;
	}

	@Override
	// robot spinning action
	public void action() {
		suppressed = false;
		Motor.B.stop();
		Motor.C.stop();
		Motor.C.rotate(10000);
		while(!suppressed){
			Thread.yield();
			
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
		

	}

}
