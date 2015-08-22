package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CandyMotor extends Subsystem {
    
	public static CANTalon cMotor;
	public double speed = 0;
	
	private CandyMotor(){
		cMotor = new CANTalon (RobotMap.cMotor);
		SmartDashboard.putNumber("Candy", speed);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static void candyOn(){
		cMotor.set(SmartDashboard.getNumber("Candy"));
	}
	public static void candyOff(){
		cMotor.set(0);
	}
	
	public static CandyMotor instance;
	
	public static CandyMotor getInstance(){
		if (instance == null)
			instance = new CandyMotor();
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new ToggleCandy());
    }
}

