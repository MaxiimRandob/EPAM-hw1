import org.junit.Assert;
import org.junit.Test;

public class Task1Test
{

	@Test
	public void shouldReturnValidDecimalNumberAfterConversion()
	{
		Assert.assertEquals(Task1.convertFromBinToDec("1101"), 13);
	}

	@Test
	public void shouldReturnTrueWhenValidBinaryNumber()
	{
		Assert.assertTrue(Task1.isValidBinNum("10"));
	}

	@Test
	public void shouldReturnFalseWhenInvalidBinaryNumber()
	{
		Assert.assertFalse(Task1.isValidBinNum("12"));
	}

	@Test
	public void shouldReturnFalseWhenInputIsNotABinaryNumber()
	{
		Assert.assertFalse(Task1.isValidBinNum("abc"));
	}

	@Test
	public void shouldReturnFalseWhenBinaryNumberFieldIsEmpty()
	{
		Assert.assertFalse(Task1.isValidBinNum(""));
	}

	@Test
	public void shouldReturnFalseWhenBinaryNumberIsLongerThanIntegerLength()
	{
		Assert.assertFalse(Task1.isValidBinNum("10101010101001010101010101010010010010101010101010"));
	}


}