package com.Interace;

public class Employee  implements Person{
	
	@Override
	public void eat()
	{
		System.out.println("Eating a biriyani");
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.eat();
	}

}
