// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RobotSystem;

public class Steps{
    RobotSystem robot;
    public Steps(RobotSystem robotSystem) {
        robot = robotSystem;
    }

    public void initStateOne() {

    }

    public void stateOne() {
       robot.joystickDrive();
       //robot.setSpeed(.3);
    }

    public void initStateTwo() {
        
    }

    public void stateTwo() {
        
    }

    public void initStateThree() {
        
    }

    public void stateThree() {
        
    }

    public void initStateFour() {
        
    }

    public void stateFour() {
        
    }


}
