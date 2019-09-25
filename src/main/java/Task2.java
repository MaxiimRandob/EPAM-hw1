import java.util.Scanner;

public class Task2
{
	public static void main(String[] args)

	{
		showIntegerInTheConsole(binaryNegateInt(scanFromConsole()));
	}

	public static int scanFromConsole()
	{
		try (Scanner in = new Scanner(System.in))
		{
			System.out.println("Enter your number: ");
			return in.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Something wrong with your input!");
		}

		return 0;
	}

	public static int binaryNegateInt(int inputInt)
	{
		return ~inputInt + 1;
	}

	public static void showIntegerInTheConsole(int output)
	{
		System.out.println("Your negated number is: " + output);
	}
}
