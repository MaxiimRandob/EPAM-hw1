package task5.service.impl;

import task5.service.BitSwitcherService;

public class BitSwitcherServiceImpl implements BitSwitcherService
{
	@Override
	public int switchBitToZero(
		final int value,
		final int pos)
	{
		return value & ~(1 << pos);
	}

	@Override
	public int switchBitToOne(
		final int value,
		final int pos)
	{
		return value | (1 << pos);
	}
}
