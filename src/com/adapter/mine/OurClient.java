package com.adapter.mine;

public class OurClient {

	public static void main(String[] args) 
	{
		//So now we can create a turkey
		WildTurkey turkey = new WildTurkey();
		
		//And send it to the Turky Adapter
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		//Now we can call duck's method
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
	}
	


}
