import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

	Bacteria [] colony;//declare bacteria variables here   
	public void setup()   
	{     
		size(500,500);
		background(0);
		colony = new Bacteria[10];
		for(int i = 0; i < colony.length; i++)
		{
			colony[i] = new Bacteria();
		}
	 }   //initialize bacteria variables here   
	 public void draw()   
	 {
	 	background(0);
	 	for(int i = 0;i < colony.length;i++)
	 	{
	 		colony[i].walk();
	 		colony[i].show();
	 	}
	 	//move and show the bacteria   
	 }  
	 class Bacteria    
	 {     
	 	int myX, myY, bacteria1,bacteria2,bacteria3;
	 	Bacteria() //constuctor
	 	{
	 		myX = (int)(Math.random()*400);
	 		myY = (int)(Math.random()*400);
	 		bacteria1 = (int)(Math.random()*255);
	 		bacteria2 = (int)(Math.random()*255);
	 		bacteria3 = (int)(Math.random()*255);
	 	}
	 	public void walk()
	 	{
	 		int direction = (int)(Math.random()*4);
	 		if(direction == 0)
	 		{
	 			myX = myX + 1;
	 		}
	 		if(direction == 1)
	 		{
	 			myX = myX - 1;
	 		}
	 		if(direction == 2)
	 		{
	 			myY = myY + 1;
	 		}
	 		if(direction == 3)
	 		{
	 			myY = myY - 1;
	 		}
	 	}
	 	public void show()
	 	{
	 		fill(bacteria1,bacteria2,bacteria3);
	 		ellipse(myX,myY,20,20);
	 	}
	 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
