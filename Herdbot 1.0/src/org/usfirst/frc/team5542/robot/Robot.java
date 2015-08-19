
package org.usfirst.frc.team5542.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5542.robot.commands.CommandBase;
import org.usfirst.frc.team5542.robot.commands.SendData;
import org.usfirst.frc.team5542.robot.commands.autonomous.AutoGamePlan;
import org.usfirst.frc.team5542.robot.commands.autonomous.JustMove;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	CommandBase.init();
    	oi = new OI();
    	
    	SmartDashboard.putData("Sound 1" , new SendData("1.mp3"));
    	SmartDashboard.putData("Sound 2" , new SendData("2.mp3"));
    	SmartDashboard.putData("Sound 3" , new SendData("3.mp3"));
    	SmartDashboard.putData("Sound 4" , new SendData("4.mp3"));
    	SmartDashboard.putData("Sound 5" , new SendData("5.mp3"));
    	SmartDashboard.putData("Sound 6" , new SendData("6.mp3"));
    	SmartDashboard.putData("Sound 7" , new SendData("7.mp3"));
    	SmartDashboard.putData("Sound 8" , new SendData("8.mp3"));
    	SmartDashboard.putData("Sound 9" , new SendData("9.mp3"));
    	SmartDashboard.putData("Sound 10" , new SendData("10.mp3"));
    	autonomousCommand = new JustMove();
        //de-comment this when competing or testing auto
        
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
