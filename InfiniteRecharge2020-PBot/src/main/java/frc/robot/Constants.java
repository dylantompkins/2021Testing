/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                    */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 * Squiward
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Motor speed
    public final static double kHopperReverseSpeed = -0.6;
    public final static double kHopperForwardSpeed = 0.6;
    public final static double kCbotStopperReverseSpeed = 0.6;
    public final static double kPbotStopperReverseSpeed = 1.0;
    public final static double kCbotStopperForwardSpeed = -0.6;
    public final static double kPbotStopperForwardSpeed = -1.0;
    public final static double kIntakeForwardSpeed = -0.5;
    public final static double kIntakeReverseSpeed = 0.5;
    public final static double kSuckerForwardSpeed = -0.6;
    public final static double kSuckerReverseSpeed = 0.6;
    public final static double kShooterMotorSpeed = -0.5;
    public final static double kArmUpSpeed = 1.0;
    public final static double kArmDownSpeed = -1.0;

    // Motor Ramp Rates (HOW LONG IN SECONDS FROM NEUTRAL TO FULL THROTTLE)
    public final static double kHopperRampRate = 0.5;
    public final static double kStopperRampRate = 0.5;
    public final static double kSuckerRampRate = 0.5;
    public final static double kIntakeRampRate = 0.5;
    public final static double kShooterRampRate = 0.5;
    public final static double kArmRampRate = 0.5;
    public final static double kDriveRampRate = 0.5;
    
    // Controller Ports
    public final static int kDriverControllerPort = 0;
    public final static int kManipulatorControllerPort = 1;

    //CANid/channel numbers
    public final static int kPbotLeftMotorCANID = 1;
    public final static int kPbotRightMotorCANID = 2;
    public final static int kCbotFrontLeftMotorCANID = 1;
    public final static int kCbotFrontRightMotorCANID = 2;
    public final static int kCbotRearLeftMotorCANID = 3;
    public final static int kCbotRearRightMotorCANID = 4;
   
    public final static int kHopperChannel = 5;
    public final static int kIntakeChannel = 6;
    public final static int kShooterMotorPort = 7;
    public final static int kSuckerChannel = 8;
    public final static int kStopperChannel = 9;
    public final static int kArmCANID = 10;
    
    //Timeouts
    public final static double kMoveOneBallTimeOut = 1.0;
    public final static double kMoveAllBallsTimeOut = 5.0;
    public final static double kStoppertoShooterTimeout = 0.5;

    //Squared Inputs
    public final static boolean kFastSquaredInputs = false;
    public final static boolean kSlowSquaredInputs = true;
}
