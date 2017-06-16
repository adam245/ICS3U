package com.usingarbitrator;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class ultrasonicsensor implements Behavior {
// Parking method
	private UltrasonicSensor sonar;
	private boolean suppressed = false;


	public ultrasonicsensor(UltrasonicSensor us){
		this.sonar = us;
	}

	@Override
	// when object is closer than a distance of 15 it activates the parking
	public boolean takeControl() {
		System.out.println(sonar.getDistance());
		return sonar.getDistance() < 15;

	}

	@Override
	// Parks the robot in between two boxes
	public void action() {
		suppressed = false;
		Motor.B.backward();
		Motor.C.backward();
		Delay.msDelay(950);
		Motor.B.stop();
		Motor.C.stop();
		Delay.msDelay(1200);
		//starts the rotations
		Motor.B.rotate(-340);
		Motor.B.backward();
		Motor.C.backward();
		Delay.msDelay(1500);
		Motor.B.stop();
		Motor.C.stop();
		Motor.C.rotate(-340);
		while(!suppressed){
			Thread.yield();
			// Robot is parked
		}
	}

	@Override
	public void suppress() {
		suppressed = true;
	}




}
