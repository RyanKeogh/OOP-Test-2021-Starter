package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet

{


	ArrayList<Note> n = new ArrayList<Note>();


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
	}

	public void draw()
	{
		background(0);
		
	}

	void loadNotes()
	{
		char[] ch = new char[score.length()];
		for(int i=0;i<score.length();i++)
		{
			ch[i] = score.charAt(i);
		}
		for ( char c : ch)
		{
			println(c);
		}

	}

	void drawNotes()
	{
	}
}
