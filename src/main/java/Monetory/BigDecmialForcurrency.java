package Monetory;

import java.math.BigDecimal;

public class BigDecmialForcurrency {
	public static void main(String args[]) {
		int scale=2;
		double value = 0.199999;
		BigDecimal tempBig = new BigDecimal(Double.toString(value));
		tempBig=tempBig.setScale(scale,BigDecimal.ROUND_FLOOR);
		String strValue= tempBig.stripTrailingZeros().toPlainString();
		System.out.println(strValue);
	}

}
