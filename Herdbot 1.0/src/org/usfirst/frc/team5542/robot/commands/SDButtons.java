package org.usfirst.frc.team5542.robot.commands;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 *
 */
public class SDButtons extends CommandBase {
	SendableChooser sc = new SendableChooser();
	Sendable sound1;
	Sendable sound2;
	
	
    public SDButtons() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	sc.addDefault("sound 1" , sound1);
    	sc.addDefault("sound 2" , sound2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
