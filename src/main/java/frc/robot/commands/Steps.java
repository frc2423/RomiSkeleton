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
       robot.setNumber("double", 3.5);
       robot.setNumber("integer", 3);
    }

    public void startStep2() {
    }

    public void step2() {
        robot.setStep(3);
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
