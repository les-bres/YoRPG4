/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated
    private Character pat;   //Is it man or woman?
    private Character smaug; //Friendly generic monster name, eh?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

	String s;
	String Vocation = "";
	String name = "";
	s = "Welcome to Ye Olde RPG!\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
	s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	
	s = "Brave Adventure, What is your vocation?\n";
	s += "\t1:Warrior\n";
	s += "\t2:Mage\n";
	s += "\t3:Rogue\n";
	s += "\t4:Pegasus\n";
	s += "\t5:Ent\n";
	s += "Selection: ";
	
	System.out.print( s );
	
	try {
	    Vocation = in.readLine();
	}
	catch ( IOException e ) { }


	//instantiate the player's character
	if (Vocation.equals ("1")){
	pat = new Warrior ( name );}
	else if (Vocation.equals ("2")){
	pat = new Mage( name );}
	else if (Vocation.equals ("3")){
	pat = new Rogue( name );}
	else if (Vocation.equals ("4")){
	pat = new Pegasus( name );}
	else if (Vocation.equals ("5")){
	pat = new Pegasus( name );}
	else {System.out.println(" Not a valid class selection"); }

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
            Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

	int i = 1;
	int d1, d2;
	String monster;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "Nothing to see here. Move along!" );

	else {
	    double n = (int) (Math.random() * 5);
	    if (n == 0) {
	    	System.out.println( "Lo, yonder monster approacheth!" );
	    	smaug = new Monster();
	    	monster = "monster";
	    }
	    else if (n == 1) {
	    	System.out.println( "Lo, yonder dragon approacheth!" );
	    	smaug = new Dragon();
	    	monster = "dragon";
	    }
	    else if (n == 2) {
	    	System.out.println( "Lo, yonder troll approacheth!" );
	    	smaug = new Troll();
	    	monster = "troll";
	    }
	    else if (n == 3) {
	    	System.out.println( "Lo, yonder goblins approacheth!" );
	    	smaug = new Goblin();
	    	monster = "goblin";
	    }
	    else {
	    	System.out.println( "Lo, yonder pegasus approacheth!" );
	    	smaug = new Pegasus();
	    	monster = "pegasus";
	    }

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "Do you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = 0;
		if (monster.equals("monster")) {
			d2 = smaug.attack( pat );
		}
		else if (monster.equals("dragon")) {
			n = Math.random();
			if (n < 0.33) {
				d2 = ((Dragon)smaug).breathFire( pat );
				System.out.println("Thy opponent hath breathed Devil's fire upon ye.  Save yourself!");
			}
			else if (n < 0.66) {
				d2 = ((Dragon)smaug).swipe( pat );
				System.out.println("A might claw hath struck your head.  Invest in a helmet.");
			}
			else {
				d2 = smaug.attack( pat );
			}
		}
		else if (monster.equals("troll")) {
			((Troll)smaug).angry();
			n = Math.random();
			if (n < 0.33) {
				d2 = ((Troll)smaug).useMeme( pat );
				System.out.println("Your argument hath been refuted by a meme!  The embarrassment is unendurable.");
			}
			else if (n < 0.66) {
				d2 = ((Troll)smaug).club( pat );
				System.out.println("Next time you see a large club headed toward you, duck!");
			}
			else {
				d2 = smaug.attack( pat );
			}
		}
		else if (monster.equals("goblin")) {
			((Goblin)smaug).swarm();
			d2 = smaug.attack( pat );
			}
		
		else if (monster.equals("pegasus")) {
			pat.tame( (Pegasus)smaug );
			if ( ((Pegasus)smaug).getTame() == false ) {
				d2 = ((Pegasus)smaug).attack( pat );
				System.out.println("Some pegasi were not meant to be tamed!  And this one is angry...");
			}
			else {
				System.out.println("Ye hath tamed a pegasus.  Your stealth and strength have upgraded, as well as your attack!");
			}
		}

		System.out.println( pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "Ye Olde opponent hit back for " + d2 +
				    " points of damage.");
		System.out.println( "Calculate your next move, brave adventurer!  Remains of ye health be " + pat.getHealth());
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else
	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );

    }//end main

}//end class YoRPG




/*=============================================
  =============================================*/

