package yahtzee;
public class DieTester
{
	public static void main(String[] args)
	{
		DieInterface[] dice = new DieInterface[5];
		System.out.println("Constructor: They should already have random face values");
		for(int i = 0; i < 5; i++)
		{
			dice[i] = new Die();
			System.out.print("Die #" + (i + 1) + ": " + dice[i].getFaceValue() + "  ");
		}
		System.out.println();

		System.out.println("roll(): Each die should appear random");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print("Die #" + (j + 1) + ": " + dice[j].roll() + "  ");
			}
			System.out.println();
		}

		System.out.println("getFaceValue(): The line below should be the same as previous line");
		for(int j = 0; j < 5; j++)
		{
			System.out.print("Die #" + (j + 1) + ": " + dice[j].getFaceValue() + "  ");
		}
		System.out.println();

		System.out.println("toString(): They should simply says \"Die: x\" where x is between 1 and 6");
		for(int j = 0; j < 5; j++)
		{
			System.out.println(dice[j]);
		}

		System.out.println("DieInterface.toDieString(): They should look like dice (Vertical)");
		//StringBuilder b=new StringBuilder();
                for(int j = 0; j < 5; j++)
		{
                   // b.append(DieInterface.toDieString(dice[j]));
			System.out.println(DieInterface.toDieString(dice[j]));
		}
                System.out.println("testing string build outside the array complex");
                //System.out.println(b.toString());

		System.out.println("DieInterface.toDiceString(): They should look like dice (Horizontal) with numbers");
		System.out.print(DieInterface.toDiceString(dice));
                System.out.println("testing the dice facevalues using a string builder"
                        + "");
                StringBuilder builder=new StringBuilder();
                String[] fcs=DieInterface.dieFaces;
                for(String s :fcs){
                builder.append(s).append("\t");
                }
                //
                System.out.println(builder.toString());
	}
}