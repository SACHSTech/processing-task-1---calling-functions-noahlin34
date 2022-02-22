import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    //the sun
    fill(255, 255, 0);
    ellipse(15, 15, 100, 100);

    //draws the ground
    fill(150, 75, 0);
    rect(0, 400, 2000, 200);

    //base of the house
    fill(255, 0, 0);
    square(150, 200, 300);

    //draws the roof
    fill(212, 175, 55);
    triangle(150, 200, 300, 50, 450, 200);

    //draws a door on "top" of the house
    fill(34, 139, 34);
    rect(300, 300, 100, 200);




 

    
  }
  
  // define other methods down here.
}