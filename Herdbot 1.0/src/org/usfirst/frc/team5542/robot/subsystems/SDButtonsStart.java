package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.commands.SDButtons;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SDButtonsStart extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Object sound() {
		return null;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SDButtons());
    }
    public static SDButtons instance;
	
    public static SDButtons getInstance(){
    	if (instance == null)
    		instance = new SDButtons();
    	return instance;
    }
}
