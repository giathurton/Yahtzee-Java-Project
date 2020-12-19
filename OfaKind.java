
package yahtzee;


public class OfAKind  extends Score{
    public OfAKind(){
    }
    int faceNo;
    //the no argument constructor
    public OfAKind(String aName, int numSameFaces){
    super(aName);
    this.faceNo=numSameFaces;
    }
    @Override
    public int getDiceScore(DieInterface[] dice){
     int count3=0;
     int count4=0;
     int count5=0;
     int count6=0;
     int count2=0;
     int count1=0;
             
   
      
         for(DieInterface d : dice){
        
        System.out.println(this.getName());
        System.out.print("face number="+ faceNo);
         
         if(d.getFaceValue()==4){
            count4++;
     
        } else if(d.getFaceValue()==5){
        count5++;
        } else if(d.getFaceValue()==3){
        count3++;
        } else
         if(d.getFaceValue()==6){
            count6++;
     
        } else if(d.getFaceValue()==2){
        count2++;
        } else if(d.getFaceValue()==1){
        count1++;
        }
         
        
       
    }
         
        
   int totalScore=0;
    if(count1==faceNo||count2==faceNo||count3==faceNo||count4==faceNo||count5==faceNo||count6==faceNo){
    if(count1==faceNo){
        totalScore=count1*faceNo;
    } else if(count2==faceNo){
           totalScore=count2*faceNo;
    } if(count3==faceNo){
           totalScore=count3*faceNo;
    } else if(count4==faceNo){
           totalScore=count4*faceNo;
    } if(count5==faceNo){
           totalScore=count5*faceNo;
    } else if(count6==faceNo){
           totalScore=count6*faceNo;
    }
    } 
    
   
    return totalScore;
    }
}