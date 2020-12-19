//Created by Gia Thurton
package yahtzee;


public class Chance extends Score{
    public Chance(){
    
    }
    public Chance(String name){
    super(name);
    }
      @Override
    public int getDiceScore(DieInterface[] dice){
    int total=0;
    for(DieInterface d: dice ){
    total+=d.getFaceValue();
    }
    return total;
    }
}