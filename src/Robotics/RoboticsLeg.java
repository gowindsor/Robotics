package Robotics;

import java.util.concurrent.TimeUnit;

public class RoboticsLeg {
	public boolean Move(int distance) throws InterruptedException {
		if (distance > 0) {
			System.out.println("Move Forward" + String.valueOf(distance));
		} else if (distance < 0) {
			System.out.println("Move Backward" + String.valueOf(distance));
		}
		TimeUnit.SECONDS.sleep(1);
		return true;
	}
	

	public boolean Turn(int degree) throws InterruptedException {
		if (degree > 0) {
			System.out.println("Turn Right" + String.valueOf(degree) + "Degree");
		} else if (degree < 0) {
			System.out.println("Turn Left"+ String.valueOf(degree) + "Degree");
		}
		TimeUnit.SECONDS.sleep(1);
		return true;
		
	}
}
