package com.usingarbitrator;

import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
/**
 * The program parks the robot in between two boxes
 * @author Adam Seftel
 *16/06/2017
 */
public class Parking {
// the arbitrator
	public static void main (String[]args){
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
		Behavior b1 = new DriveForward();
		Behavior b4 = new ultrasonicsensor(sonar);
		Behavior b2 = new Endprogram();
		Behavior b3 = new soundsensor();
		
		Behavior[] arby = {b1, b4, b3, b2};
		Arbitrator arbys = new Arbitrator(arby);
		arbys.start();
	}
}
 