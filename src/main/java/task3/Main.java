package task3;

import task3.service.impl.BitCounterServiceImpl;

public class Main
{
	private BitCounterServiceImpl bitCounter;

	public static void main(String[] args)
	{
		 Main main = new Main();


		System.out.println("long length in bits = " + main.getBitCounter().bitCount(Long.MAX_VALUE));
		System.out.println("int length in bits = " + main.getBitCounter().bitCount(Integer.MAX_VALUE));
		System.out.println("short length in bits = " + main.getBitCounter().bitCount(Short.MAX_VALUE));
		System.out.println("byte length in bits = " + main.getBitCounter().bitCount(Byte.MAX_VALUE));
	}

	public BitCounterServiceImpl getBitCounter()
	{
		return bitCounter;
	}

	public void setBitCounter(final BitCounterServiceImpl bitCounter)
	{
		this.bitCounter = bitCounter;
	}
}
