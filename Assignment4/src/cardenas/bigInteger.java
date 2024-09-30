package cardenas;

import java.math.BigInteger;

public class bigInteger {
	
private BigInteger num;
	

	//bigInteger constructor
	public bigInteger(String input) {
		this.num = new BigInteger(input);
	}
	
	// mod function that gets the mod of the bigInteger object
		public bigInteger mod(bigInteger other) {
			BigInteger result = this.num.mod(other.num);
	        return new bigInteger(result.toString());
		}
		
	
	//add function that adds to a total and return the total amount
	public bigInteger add(bigInteger other) {
		BigInteger total = this.num.add(other.num);
		return new bigInteger(total.toString());
	}
	
	//returns numString
	public String getStr() {
		return this.num.toString();
	}

}
