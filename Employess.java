package com.Vstand;

public class Employess  extends Oracal implements Students, Vstand {
	
	@Override
	public void test()
	{
		System.out.println("Testing APP");
	}
	
	@Override
	public void develop()
	{
		System.out.println("I'm developed  in application");
		
	}
	
	public static void main(String[] args)
	{
		Employess e = new Employess();
		e.test();
		e.work();
		e.develop();
	}

}
