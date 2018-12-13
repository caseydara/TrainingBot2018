package org.iraiders.trainingbot.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.iraiders.trainingbot.robot.RobotMap;

public class DriveSubsystem extends Subsystem {
  public WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.frontLeftTalonPort);
  public WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.frontRightTalonPort);
  private WPI_TalonSRX backLeft = new WPI_TalonSRX(RobotMap.backLeftTalonPort);
  private WPI_TalonSRX backRight = new WPI_TalonSRX(RobotMap.backRightTalonPort);
  public DifferentialDrive roboDrive;

  public DriveSubsystem(){
  backRight.set(ControlMode.Follower, RobotMap.frontRightTalonPort);
  backLeft.set(ControlMode.Follower, RobotMap.frontLeftTalonPort);
    roboDrive = new DifferentialDrive(frontLeft, frontRight);
  }

  @Override
  protected void initDefaultCommand() {
  }
}
