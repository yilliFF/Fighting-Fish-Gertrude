package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "GertrudeTeleop", group = "")
public class GertrudeTeleop extends LinearOpMode {

  private DcMotor leftMotor;
  private Servo claw;
  private DcMotor rightMotor;
  private DcMotor armMotor;
  
  @Override
  public void runOpMode() {
    leftMotor = hardwareMap.dcMotor.get("leftMotor");
    claw = hardwareMap.servo.get("claw");
    rightMotor = hardwareMap.dcMotor.get("rightMotor");
    armMotor = hardwareMap.dcMotor.get("armMotor");

    leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    claw.setPosition(0.6);
    claw.scaleRange(0.6, 1);
    waitForStart();
    if (opModeIsActive()) {
      while (opModeIsActive()) {
        leftMotor.setPower(-gamepad1.left_stick_y);
        rightMotor.setPower(-gamepad1.right_stick_y);
        armMotor.setPower(-gamepad2.left_stick_y);
        claw.setPosition(gamepad2.right_trigger);
        telemetry.update();
      }
    }
  }
}
