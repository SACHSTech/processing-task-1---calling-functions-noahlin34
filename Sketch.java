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

    fill(255, 0, 0);
    square(150, 200, 300);

    fill(212, 175, 55);
    triangle(150, 200, 300, 50, 450, 200);

    fill(34, 139, 34);
    rect(300, 300, 100, 200);

    
  }
  
  // define other methods down here.
}