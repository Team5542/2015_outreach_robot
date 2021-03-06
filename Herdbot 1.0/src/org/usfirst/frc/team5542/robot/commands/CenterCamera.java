package org.usfirst.frc.team5542.robot.commands;


/**
 *centers the camera (values will change later)
 */
public class CenterCamera extends CommandBase {

    public CenterCamera() {
        requires(camera);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	camera.setPan(.5);
    	camera.setTilt(.3);
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
