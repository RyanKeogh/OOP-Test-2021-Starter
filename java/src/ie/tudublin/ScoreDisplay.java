package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;


public class ScoreDisplay extends PApplet

{

ArrayList<Note> music = new ArrayList<Note>();


	//String score = "DEFGABcd";
	String score = "DDDEDFABAAFEFFFFED";

	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadNotes();
		printStars();

	}

	public void draw()
	{
		background(255);
		drawNotes();
		if(mouseX > 50)
		
		{
			colorMode(HSB);
			fill(100,255,255);
		}
		
	}

	boolean bool = true;

	void loadNotes() {
		


    	for(int i = 0; i < score.length(); i++) {
   			if(i < score.length())
			   {
				  if(Character.isLetter(score.charAt(i)))
				   {
					    bool = false;
				   }
			try{
				   if(Character.isDigit(score.charAt(i+1)))
				   {
					   music.add(new Note(score.charAt(i)));
					 
				   }
				   else
				   {
					music.add(new Note(score.charAt(i), 2));
				   }
				}
				catch(Exception r)
				{
					println(r);
					bool = true;
				}
				if(bool)
				{
					music.add(new Note(score.charAt(i),1));
				}
			}
		
				
				}
				 
				   println(music.size());
				   for(int i = 0; i < music.size(); i++) {
					   println(music.get(i).getNotes(),music.get(i).getDuration());
				}
				
			   }
			
    


	void printStars()
	{
		for (Note n: music)
		{
			println(n);
		}
	}

		
	


	

	void drawNotes()
	{
		stroke(0);
		fill(255);
		float border = width* 0.05f;
		
		for(int i=0;i<=5; i++)
		{
			float y = map( i,0,5,100,height-200 );
			line(border,y,width-border ,y);
			
		}
		for(int i=0; i< music.size();i++)
		{
			float x = map(i, 0, music.size(),width-100, 150 );
			float y = map(i,0,music.size(),height,100);
			Note n = music.get(i);
			
			
			
			fill(0);
			//ellipse(x,300,25,25);
			//ellipse(x,y,25,25);
			//line(x+10,300,x+10 ,250);

			line(200,310,200,270);
			ellipse(190,310,25,25);
			
			line(240,300,240,250);
			ellipse(230,300,25,25);

			line(280,290,280,230);
			ellipse(270,280,25,25);

			line(320,290,320,230);
			ellipse(310,280,25,25);

			line(360,290,360,230);
			ellipse(350,280,25,25);

			line(400,290,400,250);
			ellipse(390,300,25,25);

			line(440,290,440,230);
			ellipse(430,280,25,25);

			line(480,200,480,250);
			ellipse(470,240,25,25);


			fill(0);
			textAlign(CENTER,CENTER);
			text(n.getNotes(),x,80);



		}


		
	
		
	}

	public void mousePressed()
    {
        for(int i=0;i<music.size(); i++)
        {
           
            
           
			float x = map(i, 0, music.size(),width-100, 150 );

            if(mouseX == x)
            {
				fill(255,0,0);               
            }
			else{
				fill(0);
			}

        }
    }

	/*int
	
	whichNote = -1;
	boolean end = false;
	public void mouseDragged()
	{
		if (whichNote != -1)
		{
			int place = (int)map(mouseX, leftBorder, width - border, 1, 30);
			
			if (place >= 1 && place <= 30)
			{
				Note m = music.get(whichNote); 
				if (end)
				{
					if (place - music.get(m) > 0)
					{
						music.setNotes(place);
					}
				}
				else
				{
					if (music.getEnd() - place > 0 )
					{
						music.setStart(place);
					}
				}
			}
		}
	}*/
}
