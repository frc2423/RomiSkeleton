// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.subsystems.RobotSystem;

public class Steps {

    RobotSystem robot;

    public Steps(RobotSystem robotSystem) {
        robot = robotSystem;
    }

    public void startStep1() {
       
    }

    public void step1() {
}    robot.drive(1,0);
    robot.setstep(2)
    }

    public void startStep2() {
        
    }

    public void step2() {
        robot.drive(0,0.5);
        robot.setstep(1)
        }
    

    public void startStep3() {

    }

    public void step3() {
        
    }

    public void startStep4() {
    }

    public void step4() {
    }

}
