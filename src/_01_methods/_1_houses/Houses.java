package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob=new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		rob.setX(5);
		rob.setY(500);
	
	for(int i=9;i>0;i--) {
		Random ran=new Random();
		int x = ran.nextInt(3);
	
		if(x==0) {
		String si=("small");
		drawHouse(si);
		}

		if(x==1) {
		String si=("medium");
		drawHouse(si);
		}
		
		if(x==2) {
		String si=("large");
		drawHouse(si);
		}
			
	
		}
	}
	public void drawHouse(String size ) {
		Random gen=new Random();
		int u = gen.nextInt(255);
		int height=0;
		if(size.equals("small")) {
		height=60;
		}
		if(size.equals("medium")) {
			height=120;
			}
		if(size.equals("large")) {
			height=250;
			}
		
		
		rob.penDown();
		rob.setSpeed(100);
		rob.setAngle(360);
		rob.setPenColor(u,u,u);
		rob.move(height);
		rob.setAngle(90);
		rob.setPenColor(u,u,u);
		rob.move(30);
		rob.setAngle(180);
		rob.setPenColor(u,u,u);
		rob.move(height);
		rob.setAngle(90);
		rob.setPenColor(0,255,0);
		rob.move(30);
		}
		
		
		
	}
	
	
	
	
	

