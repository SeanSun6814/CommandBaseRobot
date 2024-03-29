/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Drive;

/**
 * An example command. You can replace me with your own command.
 */
public class ArcadeDrive extends Command {

  private Drive drive = Robot.drive;
  private OI oi = Robot.oi;
  private Joystick joy1 = oi.driveJoystick;

  public ArcadeDrive() {
    requires(drive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    drive.stop();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double power = -joy1.getRawAxis(1);
    double turn = -joy1.getRawAxis(4);

    double left = power - turn;
    double right = power + turn;

    drive.tankDrive(left, right);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    drive.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
