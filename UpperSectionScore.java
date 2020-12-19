
package yahtzee;


public class UpperSectionScore  extends Score{
    int number;
    public UpperSectionScore (String nm,int num){
  
       super(nm);
       number=num;
        
    
    }
    @Override
    public int getDiceScore(DieInterface[] dice){
        //roll
        
        int count=0;
        if(this.isUsed()==false){
         for(DieInterface d : dice){
        
        System.out.println(this.getName());
        System.out.print("face number="+ number);
         
         if(d.getFaceValue()==number){
            count++;
     
        }
        
       
    }
        }
   
    System.out.println("count="+count);
    
    int totalScore=count*number;
    System.out.println("score="+totalScore);
    return totalScore;
    }
    
}