package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "GertrudeAutonomous", group = "")
public class GertrudeAutonomous extends LinearOpMode {

  private DcMotor leftMotor;
  private DcMotor rightMotor;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    leftMotor = hardwareMap.dcMotor.get("leftMotor");
    rightMotor = hardwareMap.dcMotor.get("rightMotor");

    leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      leftMotor.setPower(0.5);
      rightMotor.setPower(0.5);
      sleep(3000);
    }
  }
}
