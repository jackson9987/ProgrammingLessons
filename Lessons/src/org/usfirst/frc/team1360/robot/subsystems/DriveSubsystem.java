
package org.usfirst.frc.team1360.robot.subsystems;

import org.usfirst.frc.team1360.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem
{
    
    Jaguar left = new Jaguar(RobotMap.DRIVE_LEFT_1);
    Jaguar left2 = new Jaguar(RobotMap.DRIVE_LEFT_2);
    Jaguar right = new Jaguar(RobotMap.DRIVE_RIGHT_1);
	Jaguar right2 = new Jaguar(RobotMap.DRIVE_RIGHT_2);

    public void initDefaultCommand()
    {
    }

    public boolean drive(float left, float right)
    {
    	this.left.set(-left);
    	this.left2.set(-left);
    	this.right.set(right);
    	this.right2.set(right);
    	
    	return(true);
    }
}

