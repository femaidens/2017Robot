package org.usfirst.frc.team2265.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

//RobotMap.java
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// Joystick Ports
	public static int driveJoyPort = 1;
	//public static int atkJoyPort = 1;

	// Talon Ports
	public static int rearLeftPort = 1;
	public static int rearRightPort = 2;
	public static int frontLeftPort = 3;
	public static int frontRightPort = 4;

	// Solenoid Ports
	public static int transIn = 2;
	public static int transOut = 3;
	
	//Solenoid Ports for gearChute
	public static int gearport1 = 6;
	public static int gearport2 = 7;
	
	public static int baseport1 = 4; //cross
	public static int baseport2 = 5; //cross
	
	//Encoder Ports
	public static int encPort1 = 0;
	public static int encPort2 = 1;
	public static int encPort3 = 2;
	public static int encPort4 = 3;
	
	//servo ports
	//public static int gearServoPort1 = 2;
	//public static int gearServoPort2 = 3;
	

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
}