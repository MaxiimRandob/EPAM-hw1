import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import task5.Main;
import task5.service.impl.BitSwitcherServiceImpl;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Task5MockitoTest
{

	@Mock
	BitSwitcherServiceImpl bitSwitcherServiceMock;

	@InjectMocks
	Main instance = new Main();

	@Test
	public void shouldReturnIntTwentyFourInsteadOfSixteenWhenSwitchingToOneOnPositionThree()
	{
		Mockito.when(bitSwitcherServiceMock.switchBitToOne(16, 3)).thenReturn(24);
		int result = instance.getBitSwitcher().switchBitToOne(16, 3);

		assertEquals(24, result);
	}

	@Test
	public void shouldReturnIntSixteenInsteadOfTwentyFourWhenSwitchingToZeroOnPositionThree()
	{
		Mockito.when(bitSwitcherServiceMock.switchBitToZero(24, 3)).thenReturn(16);
		int result = instance.getBitSwitcher().switchBitToZero(24, 3);

		assertEquals(16, result);
	}
}
