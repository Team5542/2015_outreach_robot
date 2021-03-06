package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.subsystems.CandyMotor;

import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class ToggleCandy extends CommandBase {
	
    public ToggleCandy() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(candymotor);
    }
  

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	candymotor.candyOn();
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
    	candymotor.candyOff();
    }
}
