package org.usfirst.frc.team5542.robot.commands;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SendData extends Command {
	
	String name = "";
	String serverAddress = "rhpi2.local";
    Socket s;
    PrintWriter out;
	
    public SendData(String nameDummy) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	name = nameDummy;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	try {
    		s = new Socket(serverAddress, 8000);
    		out = new PrintWriter(s.getOutputStream(), true);
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	out.println(name);
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
