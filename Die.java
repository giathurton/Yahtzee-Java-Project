//Created by Gia Thurton
package yahtzee;

import java.util.Random;


public class Die implements DieInterface {
//set  the no argument constructor
    private final  Random rand;
    private final  int totalFaces;
    //i set the default face to one
    int  currentFace;
  
    
   //end of no argument constructor
    //set the main constructor
   public Die(){
   this.totalFaces=6;
   rand=new Random();
   int r=1+rand.nextInt(totalFaces);
   currentFace=r;
   }
  
    @Override
    public int roll() {
        //this.totalFaces=6;
   //rand=new Random();
        //to roll means to randomly pick a face
        int r=1+rand.nextInt(totalFaces);
        currentFace=r;
        
        //System.out.println("face in roll,1 and 6");
         //System.out.println(currentFace);
        return r;
        
        
        
    }


    @Override
    public int getFaceValue() 
    {
  
        return currentFace;
    }
    public String toString(){
    String die="Die : "+getFaceValue();
    return die;
    }
}