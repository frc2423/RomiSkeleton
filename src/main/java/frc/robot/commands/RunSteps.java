// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.Supplier;
import frc.robot.commands.Steps;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;
import frc.robot.subsystems.OnBoardIO.ChannelMode;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.subsystems.RobotSystem;

public class RunSteps extends CommandBase {
    private Drivetrain drivetrain;
    private XboxController joystick;
    private int state;
    private Steps steps;
    private RobotSystem robot;

    public RunSteps(Drivetrain drive, XboxController joy) {
        drivetrain = drive;
        joystick = joy;
        state = 0;
        robot = new RobotSystem(drivetrain, joystick);
        steps = new Steps(robot);
        addRequirements(drivetrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        updateVariables();
        switch (state) {
            case 0:
                break;
            case 1:
                steps.stateOne();
                break;
            case 2:
                steps.stateTwo();
                break;
            case 3:
                steps.stateThree();
                break;
            case 4:
                steps.stateFour();
                break;
            default:
                break;
        }

        if (robot.getState() != state) {
            switch(robot.getState()) {
                case 1: steps.initStateOne();
                    break;
                case 2: steps.initStateTwo();
                    break;
                case 3: steps.initStateThree();
                    break;
                case 4: steps.initStateFour();
                    break; 
            }
            state = robot.getState();
        }
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    //update any variables to uses during steps
    private void updateVariables() {
        robot.isButtonAPressed = joystick.getAButton();
        robot.isButtonBPressed = joystick.getBButton();
        robot.robotAngle = drivetrain.getGyroAngleZ();
        robot.robotSpeed = drivetrain.getAverageDistance();
        robot.xaxis = drivetrain.getAccelX();
        robot.yaxis = drivetrain.getAccelY();
    }
}
