import java.util.Scanner;

public class Task1
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your binary number: ");
		String binNum = in.nextLine();

		int decNum = convertFromBinToDec(binNum);

		System.out.println(binNum + " -> " + decNum);

	}

	public static int convertFromBinToDec(String binNum)
	{
		int decNum = 0;
		int counter = 0;
		for (int i = binNum.length() - 1; i >= 0; i--)
		{
			if (binNum.charAt(i) == '1')
			{
				decNum += (int)Math.pow(2, counter);
				counter++;
			}
			else
			{
				counter++;
			}
		}

		return decNum;
	}
}

