package yahtzee;

import java.util.Arrays;


public interface DieInterface {
	public static String[] dieFaces =
		{"+---+\n|   |\n| o |\n|   |\n+---+",
		 "+---+\n|o  |\n|   |\n|  o|\n+---+",
		 "+---+\n|o  |\n| o |\n|  o|\n+---+",
		 "+---+\n|o o|\n|   |\n|o o|\n+---+",
		 "+---+\n|o o|\n| o |\n|o o|\n+---+",
		 "+---+\n|o o|\n|o o|\n|o o|\n+---+"};

    public static String toDieString(DieInterface aDie)
{
   // System.out.println("shape index="+aDie.getFaceValue());
    
return dieFaces[aDie.getFaceValue()-1];
}
    public static String toDiceString(DieInterface[] dice)
{
StringBuilder result = new StringBuilder();
 //result.append("\t");
//String[] fcs=new String[dice.length];
//String result="";
// Add your code here
//int i=0;
for(DieInterface d : dice){
 String string=DieInterface.toDieString(d);
 result.append(string).append("\t");
 //test inside the interface
 
 //System.out.println(string);
   
//fcs[i]=string;
//i++;
}
//System.out.println("print result builder");
//System.out.println(result);
//System.out.println("print array");
//System.out.println(Arrays.toString(fcs));
return result.toString();
}
    public int roll();
public int getFaceValue();
}
