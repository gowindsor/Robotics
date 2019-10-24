package Robotics;

public class Operator {
	public static void main(String[] args) {
		
		if (args[0].equalsIgnoreCase("stop"))
			return;
		
		RoboticsArm arm = new RoboticsArm();
		RoboticsLeg leg = new RoboticsLeg();
		
		try {
			leg.Move(5);
			leg.Turn(30);
			arm.Liftup(5);
			arm.Liftdown(3);
			leg.Turn(-30);
			leg.Move(-5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
