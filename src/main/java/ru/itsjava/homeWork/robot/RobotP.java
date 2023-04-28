package ru.itsjava.homeWork.robot;

import java.awt.*;

public class RobotP {
    public static void main(String[] args) {
        Robot robot;

        {
            try {
                robot = new Robot();

                while (true) {
                    robot.keyPress(32);
                    robot.delay(200);
                    robot.keyRelease(32);
                }

            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }

}
