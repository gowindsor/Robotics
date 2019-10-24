package Robotics;

import java.util.concurrent.TimeUnit;

public class RoboticsArm {
	public boolean Liftup(int distance) throws InterruptedException {
		System.out.println("Lift Up" + String.valueOf(distance) + "CentiMeter");
		TimeUnit.SECONDS.sleep(1);
		return true;
	}
	
	public boolean Liftdown (int distance) throws InterruptedException {
		System.out.println("Lift Down" + String.valueOf(distance) + "CentiMeter");
		TimeUnit.SECONDS.sleep(1);
		return true;
		
	}
}
