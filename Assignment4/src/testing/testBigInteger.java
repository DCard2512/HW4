package testing;

import cardenas.bigInteger;

public class testBigInteger {
	public static void main(String[] args) {
		bigInteger one = new bigInteger("5842929543");
		bigInteger two = new bigInteger("2340953342");
		
		bigInteger total = one.add(two);
		
		System.out.println("Total: " + total.getStr());
		
		bigInteger three = new bigInteger("220");
		bigInteger four = new bigInteger("40");
		
		bigInteger result = three.mod(four);
		
		System.out.println("Mod Result: " + result.getStr());
		
		bigInteger neg = new bigInteger("-220");
		bigInteger pos = new bigInteger("40");
		
		bigInteger result2 = neg.mod(pos);
		
	    System.out.println("Negative result: " + result2.getStr());
	}
	
}
