package task3.service.impl;

import task3.service.BitCounterService;

public class BitCounterServiceImpl
	implements BitCounterService
{
	@Override
	public int bitCount(long val)
	{
		int counter = 0;
		while (val > 0)
		{
			val = val >> 1;
			++counter;
		}

		return counter + 1;
	}
}
