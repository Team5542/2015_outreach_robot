package org.usfirst.frc.team5542.robot.subsystems;


import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.Arm;
import org.usfirst.frc.team5542.robot.commands.UserArm;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
	
	private Talon aMotor;
	
    private Arm(){
    	aMotor = new Talon(RobotMap.aMotor);
    }

    	public void move(double input){
        	if (input > 1.0 || input < -1.0)
        		throw new IllegalArgumentException();
        	aMotor.set(input);
    }
    	public static Arm instance;
    	
    	public static Arm getInstance(){
    		if (instance == null)
    			instance = new Arm();
    		return instance;
    	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new UserArm());
    }

}

