// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.RollerConstants;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANRollerSubsystem;

//DOWNLOAD PATHPLANNER
public final class Autos {
  public static final Command taxi(CANDriveSubsystem driveSubsystem) {
    return driveSubsystem.driveArcade(driveSubsystem, () -> 1, () -> 0.0).withTimeout(4.0);
  }
  
  public static final Command taxiCenterScore(CANDriveSubsystem driveSubsystem, CANRollerSubsystem rollerSubsystem) {
    return taxi(driveSubsystem).andThen(rollerSubsystem.runRoller(rollerSubsystem, () -> RollerConstants.ROLLER_EJECT_VALUE, () -> 0).withTimeout(2));  }
}
