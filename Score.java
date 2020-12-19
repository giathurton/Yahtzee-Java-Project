package yahtzee;


public abstract class Score  implements ScoresInterface{
    public Score(){
    
    }
    String name;
    int score;
    boolean isUsed=false;
    public Score(String nm){
    this.name=nm;
   
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDiceScore(DieInterface[] dice) {
        
        throw new UnsupportedOperationException("Not supported yet.");
        } 

    @Override
    public int getScore() {
        return score;
       
    }

    @Override
    public void setScore(DieInterface[] dice) {
        score=getDiceScore(dice);
        isUsed=true;
        //when u set the score ,marked used;
       // isUsed=true;
        
    }
    @Override
    public boolean isUsed() {
        
        return isUsed;
    }

    @Override
    public void reset() {
        this.score=0;
        isUsed=false;
    }
    public String toString()
{
String scoreString = String.format("%3d",this.getScore());
return name + ": " + scoreString;
}
}