import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import task3.Main;
import task3.service.impl.BitCounterServiceImpl;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Task3MockitoTest
{
	@Mock
	BitCounterServiceImpl bitCounterServiceMock;

	@InjectMocks
	Main instance = new Main();

	@Test
	public void should64ReturnWhenInputIsMaxLong()
	{
		Mockito.when(bitCounterServiceMock.bitCount(Long.MAX_VALUE)).thenReturn(64);

		int result = instance.getBitCounter().bitCount(Long.MAX_VALUE);

		assertEquals(64, result);
	}

	@Test
	public void shouldReturn32WhenInputIsMaxInt()
	{
		Mockito.when(bitCounterServiceMock.bitCount(Integer.MAX_VALUE)).thenReturn(32);

		int result = instance.getBitCounter().bitCount(Integer.MAX_VALUE);

		assertEquals(32, result);
	}

	@Test
	public void shouldReturn16WhenInputIsMaxShort()
	{
		Mockito.when(bitCounterServiceMock.bitCount(Short.MAX_VALUE)).thenReturn(16);

		int result = instance.getBitCounter().bitCount(Short.MAX_VALUE);

		assertEquals(16, result);
	}

	@Test
	public void shouldReturn8WhenInputIsMaxByte()
	{
		Mockito.when(bitCounterServiceMock.bitCount(Byte.MAX_VALUE)).thenReturn(8);

		int result = instance.getBitCounter().bitCount(Byte.MAX_VALUE);

		assertEquals(8, result);
	}
}
