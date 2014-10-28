package com.adapter.mine;

public class WildTurkey implements Turkey 
{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying a short distance");
		
	}

}

/*
 *	Now, this has different method, how we will be able to use the same Duck's interface to call these
 * Turkey's methods??
 * 
 *  We will create an Adapter - TurkeyAdapater
 * */
