package yahtzee;


public class FullHouse extends Score {
    public FullHouse(){
    
    }
    
public FullHouse(String name){
super(name);
}
@Override
    public int getDiceScore(DieInterface[] dice){
    int count3=0;
     int count4=0;
     int count5=0;
     int count6=0;
     int count2=0;
     int count1=0;
             
     int count=0;
      
         for(DieInterface d : dice){
        
        System.out.println(this.getName());
        //System.out.print("face number="+ faceNo);
         
         if(d.getFaceValue()==4){
            count4++;
     
        } else if(d.getFaceValue()==5){
        count5++;
        } else if(d.getFaceValue()==3){
        count3++;
        }
         if(d.getFaceValue()==6){
            count6++;
     
        } else if(d.getFaceValue()==2){
        count2++;
        } else if(d.getFaceValue()==1){
        count1++;
        }
         
        
       
    }
        
   int totalScore=0;
   //test for 3s
    if((count1==3||count2==3||count3==3||count4==3||count5==3||count6==3)){
    //test for twos
    if((count1==2||count2==2||count3==2||count4==2||count5==2||count6==2)){
    //it has passed the test,return25
       totalScore=25; 
    }
    }
    return totalScore;
    }
    
}