package org.usfirst.frc.team5542.robot.commands;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 *
 */
public class SDButtons extends CommandBase {
	SendableChooser sc = new SendableChooser();
	Object sound;
	Object sound1;
	Object sound2;
	
    public SDButtons() {
    	requires(buttons);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	sc.addDefault("sound 1" , sound1);
    	sc.addDefault("sound 2" , sound2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	sc.getSelected();
    	buttons.sound();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
