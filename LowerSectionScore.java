package yahtzee;


public class LowerSectionScoreTester
{
	public static void main(String[] args)
	{
		ScoresInterface[] scores = new ScoresInterface[7];
		scores[0] = new OfAKind("Three of a Kind", 3);
		scores[1] = new OfAKind(" Four of a Kind", 4);
		scores[2] = new FullHouse("     Full House");
		scores[3] = new Straight(" Small Straight", 4);
		scores[4] = new Straight(" Large Straight", 5);
		scores[5] = new Chance("         Chance");
		scores[6] = new OfAKind("        Yahtzee", 5);


		DieInterface[] dice = new DieInterface[5];
		for(int i = 0; i < 5; i++)
			dice[i] = new Die();

		System.out.println(DieInterface.toDiceString(dice));

		for(int j = 0; j < 7; j++)
			System.out.println(scores[j].getName() + ": " + scores[j].getDiceScore(dice));
	}
}