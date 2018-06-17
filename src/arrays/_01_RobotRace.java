package arrays;

import java.awt.AWTException;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) throws AWTException {
	

	//2. create an array of 5 robots.
Robot[] robo = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robo.length; i++) {
robo[i]=new Robot();

}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robo[0].moveTo(50,500);
robo[1].moveTo(250, 500);
robo[2].moveTo(450, 500);
robo[3].moveTo(650, 500);
robo[4].moveTo(850, 500);

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random r = new Random ();


	

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
int 
j= 0;
while(true) {
	for (int i = 0; i < robo.length; i++) {
		int a= r.nextInt(50);
		robo[i].setSpeed(10);
	
	
		
		 if(robo[i].getY()<=50) {
			 robo[i].setAngle(90);
				robo[i].move(a);}
		 if(robo[i].getX()<=2000) {
			 robo[i].setAngle(90);
				robo[i].move(a);}
				else {
					robo[i].move(a);
					
				}
		
	}
	}
}
	//7. declare that robot the winner and throw it a party!


	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
