// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;

import java.util.HashMap;
import java.util.Map;
import frc.robot.NtHelper;

public class RobotSystem{
    private final Drivetrain drivetrain;
    private int nextStep = 1;
    public boolean isButtonAPressed = false;
    public boolean isButtonBPressed = false;
    public double angle = 0;
    public double speed = 0;
    public double distance = 0;
    public double accelX = 0;
    public double accelY = 0;
    public double joystickXAxis = 0;
    public double joystickYAxis = 0;
    public double time = 0;
    private Map<String, String> mapString = new HashMap<String, String>();
    private Map<String, Number> mapNumber = new HashMap<String, Number>();
    private Map<String, Boolean> mapBoolean = new HashMap<String, Boolean>();
    private XboxController joystick;
    private Timer timer;

    public RobotSystem(Drivetrain drive, XboxController joy, Timer timer) {
        drivetrain = drive;
        joystick = joy;
        this.timer = timer;
    }

    public void resetTimer() {
        timer.reset();
    }

    public void setTurn(double speed) {
        drivetrain.resetEncoders();
        drivetrain.arcadeDrive(0, speed);
    }

    public void setSpeed(double speed) {
        drivetrain.resetEncoders();
        drivetrain.arcadeDrive(speed, 0);
    }

    public void joystickDrive() {
        drivetrain.arcadeDrive(joystick.getRawAxis(1), joystick.getRawAxis(0));
    }
    
    public void setStep(int nextStep) {
        this.nextStep = nextStep;
    }

    public int getNextStep() {
        return nextStep;
    }

    public Number getNumber(String name) {
        return mapNumber.get(name);
    }
    public void setNumber(String name, Number value) {
        mapNumber.put(name, value);
        NtHelper.setNumber("/variables/" + name, value);
    }

    public Boolean getBoolean(String name) {
        return mapBoolean.get(name);
    }
    public void setBoolean(String name, Boolean value) {
        mapBoolean.put(name, value);
        NtHelper.setBoolean("/variables/" + name, value);
    }

    public String getString(String name) {
        return mapString.get(name);
    }
    public void setString(String name, String value) {
        mapString.put(name, value);
        NtHelper.setString("/variables/" + name, value);
    }


}
