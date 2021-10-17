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

    public void startStep1() {
    }

    public void step1() {
       robot.joystickDrive();
       if (robot.time > 3) {
           robot.setStep(2);
           robot.resetTimer();
       }
    }

    public void startStep2() {
    }

    public void step2() {
        
    }

    public void startStep3() {
    }

    public void step3() {
        robot.setStep(4);
    }

    public void startStep4() {
    }

    public void step4() {
        robot.setStep(1);
    }


}
