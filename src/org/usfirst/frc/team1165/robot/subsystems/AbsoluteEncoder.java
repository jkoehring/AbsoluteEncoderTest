package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.ReportAbsoluteEncoder;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AbsoluteEncoder extends Subsystem
{
	private AnalogInput analogInput = new AnalogInput(RobotMap.absoluteEncoderPort);
	private AnalogPotentiometer encoder = new AnalogPotentiometer(analogInput, 360.0, 0);
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public double get()
	{
		return encoder.get();
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new ReportAbsoluteEncoder());
	}
	
	public void report()
	{
		SmartDashboard.putNumber("Analog Input Voltage", analogInput.getVoltage());
		SmartDashboard.putNumber("Analog Input Value", analogInput.getValue());
		SmartDashboard.putNumber("Absolute Encoder Value", get());;
	}
}
