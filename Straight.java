
package yahtzee;

import java.util.ArrayList;


public class Straight extends Score{
    int numConsecutiveFaces;
    public Straight(){
    
    }//the no argument constructor
    public Straight(String aName, int numConsecutiveFces){
    super(aName);
    this.numConsecutiveFaces=numConsecutiveFces;
    
    }
    
   @Override
    public int getDiceScore(DieInterface[] dice){
    ArrayList<Integer> list=new ArrayList<>();
     for(DieInterface d : dice){
     list.add(d.getFaceValue());
     }
     int totalScore=0;
    if(numConsecutiveFaces==4){
    if(testSmallStraight(list)){
    totalScore=30;
    }
    } else if(numConsecutiveFaces==5){
    if(this.testLargeStraight(list)){
    totalScore=40;
    }
    }
    return totalScore;
    }
    
 public boolean testSmallStraight(ArrayList list){
 boolean test=false;
 if(this.testSmallIndex0(list)||this.testSmallIndex1(list)){
  test=true;
 }
 return test;
 }   
 public boolean testLargeStraight(ArrayList<Integer> list){
     
 boolean test=false;

 for(int i=0;i<list.size();i++){
     int k=i+1;
     if(k<list.size()-1){
     int fc=list.get(i);
     int fc2=list.get(k);
     if(fc==fc2){
     test=true;
     }
     else{
     return false;//return the moment it finds the first false condition
     }
     }
 
 
 }
 return test;
 } 
 public boolean testSmallIndex0(ArrayList<Integer> list){
 boolean test=false;
 for(int i=0;i<list.size()-1;i++){
     int k=i++;
     if(k<list.size()-1){
     int fc=list.get(i);
     int fc2=list.get(k);
     if(fc==fc2){
     test=true;
     }
     else{
     return false;
     }
     }
 
 
 }
 
 return test;
 }
 public boolean testSmallIndex1(ArrayList<Integer> list){
     boolean test=false;
     for(int i=1;i<list.size();i++){
     int k=i++;
     if(k<list.size()){
     int fc=list.get(i);
     int fc2=list.get(k);
     if(fc==fc2){
     test=true;
     }
     else{
     return false;
     }
     }
 
 
 }
     
 return test;
 }
}