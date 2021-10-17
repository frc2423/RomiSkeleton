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
        System.out.println("start 1");
    }

    public void step1() {
       robot.joystickDrive();
       System.out.println("step 1");
       robot.setStep(2);
    }

    public void startStep2() {
        System.out.println("start 2");
    }

    public void step2() {
        System.out.println("step 2");
        robot.setStep(3);
    }

    public void startStep3() {
        System.out.println("start 3");
    }

    public void step3() {
        System.out.println("step 3");
        robot.setStep(4);
    }

    public void startStep4() {
        System.out.println("start 4");
    }

    public void step4() {
        System.out.println("step 4");
        robot.setStep(1);
    }


}
