/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Team3946 GeForce
 */
public class DriveTrain extends Subsystem {
    private Talon leftMotor = new Talon(RobotMap.leftMotor);
    private Talon rightMotor = new Talon(RobotMap.rightMotor);
    private RobotDrive rd = new RobotDrive(leftMotor, rightMotor);
    public void drive(double left, double right){
        rd.tankDrive(left, right);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
