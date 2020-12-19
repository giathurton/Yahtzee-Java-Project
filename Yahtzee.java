package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Yahtzee {
    
    public Yahtzee(){
    
    }
    //create the main constructor
    String name;
    ScoresInterface[] scores;
    DieInterface[] dice;
    Scanner scanner;
    int usedCats;
    
    
    public Yahtzee(String nm,Scanner sc,ScoresInterface[] scrs,DieInterface[] dc){
    this.name=nm;
    this.dice=dc;
    this.scores=scrs;
    this.scanner=sc;
    usedCats=0;
    }
    // introduce the game
   public void printScores(){
   //use a for loop to loop and print score
       for(ScoresInterface s : scores){
       System.out.println(s.getName()+" : "+s.getScore());
       }
       
       
       
   }
    public int printTotalScore() {
        int total=0;
  for(ScoresInterface s : scores){
  total+=s.getScore();
  }
  return total;
    }
    public void rollNotInKeep(List<Integer> keep){
    //roll the dice not in keep list
        List<Integer> keepList=keep;
        
        for(DieInterface d : dice){
        if(keepList.contains(d.getFaceValue())==false){
        d.roll();
        }
        }
        
    }
    public void rollAll(){
       for(DieInterface d : dice){
       d.roll();
       }
    }
    public void selectCatToScore(int cat){
    if(cat==1){
   ScoresInterface one=scores[0];
   one.setScore(dice);
    }
     if(cat==2){
     ScoresInterface two=scores[1];
   two.setScore(dice);
     }
      if(cat==3){
       ScoresInterface three=scores[2];
   three.setScore(dice);
      }
       if(cat==4){
        ScoresInterface four=scores[3];
   four.setScore(dice);
       }
        if(cat==5){
             ScoresInterface five=scores[4];
   five.setScore(dice);
        }
         if(cat==6){
              ScoresInterface six=scores[5];
   six.setScore(dice);
         }
          if(cat==7){
               ScoresInterface seven=scores[6];
   seven.setScore(dice);
          }
           if(cat==8){
               ScoresInterface eight=scores[7];
   eight.setScore(dice); 
           }
            if(cat==9){
                 ScoresInterface nine=scores[8];
   nine.setScore(dice);
            }
             if(cat==10){
                  ScoresInterface ten=scores[9];
   ten.setScore(dice);
             }
              if(cat==11){
                   ScoresInterface elleven=scores[10];
   elleven.setScore(dice);
              }
               if(cat==12){
                    ScoresInterface twelve =scores[11];
   twelve.setScore(dice);
               }
                if(cat==13){
                 ScoresInterface thirteen=scores[12];
   thirteen.setScore(dice);
                }
                
     this.usedCats++;           
    }
    public void play(){
    //start the game and print the current scores
        this.printScores();
        while(this.usedCats<13){
              //roll  all
            System.out.println("First Roll:");
         this.rollAll();
        System.out.print( DieInterface.toDiceString(dice));
       System.out.println("Please enter the list of dice that you want to keep:");
         List<Integer> keeps=new ArrayList();
        
         keeps.add(scanner.nextInt());
         
         System.out.println("Second Roll:");
           keeps.clear();
          System.out.println("Please enter the list of dice that you want to keep:");
           
         keeps.add(scanner.nextInt());
        
            this.rollNotInKeep(keeps);
         System.out.println( DieInterface.toDiceString(dice));
         
         System.out.println("Third  Roll:");
           keeps.clear();
          System.out.println("Please enter the list of dice that you want to keep:");
          
         keeps.add(scanner.nextInt());
         
            this.rollNotInKeep(keeps);
         System.out.println( DieInterface.toDiceString(dice));
       System.out.println("Here are your scores");
       this.printScores();
       int remaininCats=13-this.usedCats;
       System.out.println("Which category would you like to use? (1 -"+remaininCats);
       int cat=1;
       
        cat=scanner.nextInt();
         
         this.selectCatToScore(cat);
         
       
        
         
        }
      
     System.out.println("Here is your final score:");
        //
        System.out.println("Name:"+this.name);
        this.printScores();
        System.out.println("Total :"+this.printTotalScore());
        
        
    }
    public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   String[] names = {"  Ones", "  Twos", "Threes", " Fours", " Fives", " Sixes"};
   ScoresInterface[] scores = new ScoresInterface[13];
		for(int i = 0; i < 6; i++)
			scores[i] = new UpperSectionScore(names[i], i + 1);
  DieInterface[] dice = new DieInterface[5];
  for(int i = 0; i < 5; i++){
			dice[i] = new Die();
  }
  scores[6] = new OfAKind("Three of a Kind", 3);
		scores[7] = new OfAKind(" Four of a Kind", 4);
		scores[8] = new FullHouse("     Full House");
		scores[9] = new Straight(" Small Straight", 4);
		scores[10] = new Straight(" Large Straight", 5);
		scores[11] = new Chance("         Chance");
		scores[12] = new OfAKind("        Yahtzee", 5);
   System.out.println("Would you like to play Yahtzee? (y/n): ");
   String invite=scanner.next();
   if(invite.equalsIgnoreCase("y")){
      System.out.println("Please enter your name"); 
   String name=scanner.next();
   Yahtzee game=new Yahtzee(name,scanner,scores,dice);
   game.play();
   } else{
   System.out.println("Thanks we will play next time");
   }
    }
    
    
}