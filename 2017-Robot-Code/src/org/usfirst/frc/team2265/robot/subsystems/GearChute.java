package org.usfirst.frc.team2265.robot.subsystems;

import org.usfirst.frc.team2265.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
// makes gear chute subsystem
//
public class GearChute extends Subsystem {
	public static DoubleSolenoid gearPiston = new DoubleSolenoid(RobotMap.gearport1, RobotMap.gearport2);
		
	public static void extend() {
		gearPiston.set(DoubleSolenoid.Value.kForward);
	}
    
	public static void retract() {
		gearPiston.set(DoubleSolenoid.Value.kReverse);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

public void initDefaultCommand() {
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


