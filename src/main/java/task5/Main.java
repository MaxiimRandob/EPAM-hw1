package task5;

import task5.service.BitSwitcherService;
import task5.service.impl.BitSwitcherServiceImpl;

public class Main
{
	private BitSwitcherServiceImpl bitSwitcher;

	public static void main(String[] args)
	{
		Main main = new Main();
		System.out.println(main.getBitSwitcher().switchBitToOne(16, 3)); //1 0000 to 1 1000; 16 to 24
		System.out.println(main.getBitSwitcher().switchBitToZero(24, 3)); //1 1000 to 1 0000; 24 to 16
	}


	public BitSwitcherServiceImpl getBitSwitcher()
	{
		return bitSwitcher;
	}

	public void setBitSwitcher(final BitSwitcherServiceImpl bitSwitcher)
	{
		this.bitSwitcher = bitSwitcher;
	}
}
