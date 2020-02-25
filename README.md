# Fighting-Fish-Gertrude
Bits and pieces used for the programming of Gertrude in the FTC 2019/2020 season, Skystone.

Gertrude is a robot that we built for competing in FTC Skystone matches. She has two Core Hex Motors at the back for driving, a HD Hex Motor at the front for spinning a combination of gears that control the arm, which goes up and down, at the end of that arm is a single servo to clench the claw to pick up Skystones.

Distance Calculations are a bunch of calculations related to making an encoder based autonomus mode, however due to Harrys incompentance, this could not be done.

GertrudeAutonomousBasic is just a simple autonomous program to make Gertrude roll forwards a set distance to reach the parking line underneth the Skybridge, in competion application Gertrude would be placed beside the wall, left or right depending on where we would be placed, wth a slight angle so that Gertrude would not crash into gaps in the wall. If we were paired up with team that ends up somewhere specific on the parking line, we could compensate for that by placing Gertrude closer to the bridge with a greater angle in order to avoid a colloision with our partner alliance. Also the basic part is so that the soon to be made encoder version can be differentiated.

GertrudeTeleop is a basic Teleop mode that allows movement of Gertrude. User 1 controls the wheel motors using the analog sticks and User 2 controls the arm using the left analog stick and the claw servo using the right trigger. With cooperation of both drivers, getting a few blocks from one side of the playing field to t he other can be done with relative ease.
