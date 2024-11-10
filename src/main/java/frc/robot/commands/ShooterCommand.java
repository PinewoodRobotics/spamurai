package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class ShooterCommand extends Command {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final ShooterSubsystem m_subsystem;

  public ShooterCommand(ShooterSubsystem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_subsystem.setShooterSpeed(Constants.ShooterConstants.shooterSpeed);
  }

  @Override
  public void end(boolean interrupted) {
    m_subsystem.setShooterSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
