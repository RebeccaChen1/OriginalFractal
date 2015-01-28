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