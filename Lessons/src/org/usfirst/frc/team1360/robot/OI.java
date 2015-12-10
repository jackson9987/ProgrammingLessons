package org.usfirst.frc.team1360.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    static Joystick drive = new Joystick(0);
    static AxisType axis1 = AxisType.kNumAxis;
    public static double drive_LeftStickX = drive.getAxis(axis1);
}

