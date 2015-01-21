package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.UserDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Drivetrain subsystem. Includes all motors used for driving.
 */
public class Drivetrain extends Subsystem {
    
	private RobotDrive myDrive;
	private Talon flMotor, frMotor, blMotor, brMotor, cMotor, aMotor;
	
	private Drivetrain(){
		flMotor = new Talon(RobotMap.flMotor);
		blMotor = new Talon(RobotMap.blMotor);
		frMotor = new Talon(RobotMap.frMotor);
		brMotor = new Talon(RobotMap.brMotor);
		cMotor = new Talon(RobotMap.cMotor);
		aMotor = new Talon(RobotMap.aMotor);
		myDrive = new RobotDrive(flMotor, blMotor, frMotor, brMotor);
	}
	
	public static Drivetrain instance;
	
	public static Drivetrain getInstance(){
		if (instance == null)
			instance = new Drivetrain();
		return instance;
	}

    public void tankDrive(double left, double right){
    	myDrive.tankDrive(left, right);
    }
    
    public void fprDrive(double move, double strafe, double turn){
    	myDrive.arcadeDrive(move, turn);
    	strafe(strafe);
    }
	
	public void strafe(double input){
    	if (input > 1.0 || input < -1.0)
    		throw new IllegalArgumentException();
    	cMotor.set(input);
    }
	
	public void initDefaultCommand() {
        setDefaultCommand(new UserDrive());
    }

	public void arm(double input) {
		aMotor.set(input);
		
	}
}

