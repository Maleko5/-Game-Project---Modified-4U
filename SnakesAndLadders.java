import java.util.*;

public class SnakesAndLadders{
     static int AIposition = 1;  // declare variable of computer player opponent
     static int position = 1; // declare variable position of player
     static int diceroll; // declare variable number of dicerolls
   public static void game(){
        Scanner scnr = new Scanner(System.in); // Searches for user input
        
        while (position != 50 || AIposition != 50)
        {
        int AIdiceroll = (int)(2 * Math.random() ) + 1; //determines the number of dice rolls for computer opponent
        int dice1 = (int)( 6 * Math.random() ) + 1;
        int dice2 = (int)( 6 * Math.random() ) + 1;
        System.out.println("do you want to roll one die or two dice?");
     	  diceroll = scnr.nextInt();
        scnr.nextLine();   
        if (diceroll == 1)
        { System.out.println("You have rolled a " + dice1);
        System.out.println("Your position now is " + (dice1 + position));
        position = position + dice1; // The line tells the computer to add the no. you got from the roll to your position.
        }
        else if (diceroll == 2)
        { System.out.println("You have rolled a " + (dice1 + dice2));
        System.out.println("Your position is now " + (dice1 + dice2 + position)); 
        position = position + dice1 + dice2;
        }
        else {
          System.out.println("not a valid number of rolls");
          diceroll = 2;
        }
        if (position == 5)
        { System.out.println("You landed on a ladder  Moving from " + position + " to " + (position + 10));
        position = position + 10;
        }
         if (position == 25)
        { System.out.println("You landed on a ladder  Moving from " + position + " to " + (position + 10));
        position = position + 10; // moves you up 10 tiles because you landed on a ladder
        }        
         if (position == 30)
        { System.out.println("Too bad you've landed on a snake  Moving from " + position + " to " + (position - 20));
        position = position - 20;
        }
         if (position == 40)
         { System.out.println("Too bad you've landed on a snake  Moving from " + position + " to " + (position - 20));
        position = position - 20; // moves you down 20 tiles because you landed on a ssssssnake
        }
         if (position > 50) {   
         int TOB = position - 50; // declare variable Tiles Outside The Board
          TOB = TOB * 2;
          position = position - TOB;
          System.out.println("You need an exact roll to end the game.   you are on tile " + position);
        }

        if (AIposition != 50 && AIdiceroll == 1)
       { System.out.println("I rolled 1 die");
       System.out.println("Iam on tile " + (AIposition + dice1));
       AIposition = AIposition + dice1;
       }
        if (AIposition != 50 && AIdiceroll == 2)
       { System.out.println("I rolled 2 dice");
       System.out.println("Iam on tile " + (AIposition + dice1 + dice2));
       AIposition = AIposition + dice1 + dice2;
       }
         if (AIposition == 5)
        { System.out.println("I landed on a ladder  Moving from " + AIposition + " to " + (AIposition + 10));
        AIposition = AIposition + 10;
        }
        if (AIposition == 25)
        { System.out.println("You landed on a ladder  Moving from " + AIposition + " to " + (AIposition + 10));
        AIposition = AIposition + 10;
        }
        if (AIposition == 30)
        { System.out.println("Too bad you've landed on a snake  Moving from " + AIposition + " to " + (AIposition - 20));
        AIposition = AIposition - 20;
        }
        if (AIposition == 40)
       { System.out.println("Too bad you've landed on a snake  Moving from " + AIposition + " to " + (AIposition - 20));
        AIposition = AIposition - 20;
        }
        if (AIposition > 50)
       { int AITOB = AIposition - 50; // declare variable Tiles Outside The board for computer player
       AITOB = AITOB * 2;
       AIposition = AIposition - AITOB;
       System.out.println("I have extras. Iam on tile " + AIposition);
       }
     
         if (position == 50)
        { System.out.println("You are a WINNER");
        break;
        }
         if (AIposition == 50)
        { System.out.println("HAHA I WIN YOU LOSE");
        break;
        }
    }
   }
}