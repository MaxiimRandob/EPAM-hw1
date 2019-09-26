import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Task2Test
{


	@Test
	public void shouldReturnCorrectIntegerWhenConsoleInputIsValid()
	{
		String input = "5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Assert.assertEquals(Task2.scanFromConsole(), 5);
	}

	@Test
	public void shouldReturnZeroWhenConsoleInputIsInvalid()
	{
		String input = "lol";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Assert.assertEquals(Task2.scanFromConsole(), 0);
	}

	@Test
	public void shouldReturnCorrectNegativeNumberWhenInputIsPositive()
	{
		Assert.assertEquals(Task2.binaryNegateInt(2), -2);
	}

	@Test
	public void shouldReturnCorrectPositiveNumberWhenInputIsNegative()
	{
		Assert.assertEquals(Task2.binaryNegateInt(-4), 4);
	}

}