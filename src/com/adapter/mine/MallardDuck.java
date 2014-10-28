package com.adapter.mine;

/*
 * A concrete duck class
 * */

public class MallardDuck implements Duck
{

	@Override
	public void quack() {
		System.out.println("Quack quack, mallard quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I fly like a mallard duck");
		
	}
	
}

/*
 *	Now suppose we need a turkey, whose interface is not similar to Duck's interface
 *	but we do not want our client to know about any different interface
 *	We only want the duck interface to be used, 
 *	So how can we do that
 *	ADAPTER pattern
 *	Let's create a Turkey Interface 
 * */
 