package org.iraiders.trainingbot.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.iraiders.trainingbot.robot.subsystems.DriveSubsystem;

public class TimerCommand extends TimedCommand {
  private DriveSubsystem drive;


  public TimerCommand(String name, double timeout, DriveSubsystem drive) {
    super(name, timeout);
    this.drive = drive;
    requires(drive);
  }

  @Override
  public void execute(){
    drive.roboDrive.tankDrive(.5,.5);
  }
  @Override
  public void end(){
    drive.roboDrive.tankDrive(0,0);
  }
}
