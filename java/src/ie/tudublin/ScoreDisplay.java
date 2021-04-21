package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;


public class ScoreDisplay extends PApplet

{



	ArrayList<Note> music = new ArrayList<Note>();


	String score = "DEFGABcd";

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
		
	}

	

	void loadNotes() {

    	for(int i = 0; i < score.length(); i++) {
   			if(i < score.length())
			   {
				music.add(new Note(score.charAt(i),1));
				
			   }
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
			float x = map(i, 0, music.size(), border + 50, height - border - 50);
			Note n = music.get(i);
			fill(0);
			textAlign(CENTER,CENTER);
			text(n.getNotes(),x,80);

		}

		

		
	}
}
