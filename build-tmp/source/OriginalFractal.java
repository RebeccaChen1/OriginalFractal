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

public class OriginalFractal extends PApplet {

public void setup()
{
	size(500,500);
	//noLoop();
}
public void draw()
{
	background(0);
	stroke(255,255,0);
	noFill();
	shapes(250,250,90);
}
public void shapes(int x, int y, int siz)
{
	if(siz>50)
	{
		shapes(x+10,y+10,siz-10);
		shapes(x+10,y-10,siz-10);
		shapes(x-10,y-10,siz-10);
		shapes(x-10,y+10,siz-10);

		shapes(x+50,y+50,siz-10);
		shapes(x+50,y-50,siz-10);
		shapes(x-50,y-50,siz-10);
		shapes(x-50,y+50,siz-10);

		shapes(x+100,y+100,siz-10);
		shapes(x+100,y-100,siz-10);
		shapes(x-100,y-100,siz-10);
		shapes(x-100,y+100,siz-10);		

	}
	else 
	{
		ellipse(x,y,siz,siz);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
