package yahtzee;


public interface ScoresInterface {
    public String getName();
public int getDiceScore(DieInterface[] dice);
public int getScore();
public void setScore(DieInterface[] dice);
public boolean isUsed();
public void reset();
}