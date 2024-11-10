package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  private PWMTalonSRX m_shooterMotor;

  public ShooterSubsystem() {
    m_shooterMotor = new PWMTalonSRX(1);
  }

  public void setShooterSpeed(double speed) {
    m_shooterMotor.set(speed);
  }
}
