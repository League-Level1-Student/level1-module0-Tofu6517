package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	background(0,0,100);
    	fill(100,0,0);
    	stroke(100,0,0);
    	ellipse(400,300,,);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
