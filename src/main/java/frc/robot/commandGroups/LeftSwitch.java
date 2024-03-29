/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commandGroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.AutoForward;
import frc.robot.commands.AutoTurn;

public class LeftSwitch extends CommandGroup {
  /**
   * Add your docs here.
   */
  public LeftSwitch() {
    addSequential(new AutoForward(2), 5);
    addSequential(new AutoTurn(90), 4);
    addSequential(new AutoForward(1), 5);
    addSequential(new AutoTurn(-90), 4);
    addSequential(new AutoForward(3), 5);
  }
}
