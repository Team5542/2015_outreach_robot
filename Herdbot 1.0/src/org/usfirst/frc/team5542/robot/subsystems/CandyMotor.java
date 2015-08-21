package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.ToggleCandy;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CandyMotor extends Subsystem {
    
	public static CANTalon cMotor;
	
	private CandyMotor(){
		cMotor = new CANTalon (RobotMap.cMotor);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static void ToggleCandy(){
		cMotor.set(Math.abs(cMotor.get() - 0.5));
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
    	setDefaultCommand(new ToggleCandy());
    }
}

