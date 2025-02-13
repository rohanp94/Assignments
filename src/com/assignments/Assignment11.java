package com.assignments;

public class Assignment11 {

	public static void main(String[] args) {

		// Example 1:

		float pow = 10;
		float num = 2.00000f;
		float i = 1;
		float sum = 1;

		while (i <= pow) {
			sum = sum * num;
			i++;
		}
		System.out.println(num + " to the power " + pow + " is :" + sum);

		// Example 2:

		float pow1 = 3;
		float num1 = 2.10000f;
		float j = 1;
		float sum1 = 1;

		while (j <= pow1) {
			sum1 = sum1 * num1;
			j++;
		}
		System.out.println(num1 + " to the power " + pow1 + " is :" + sum1);

		// Example 3:

		float pow2 = -2;
		float num2 = 2.00000f;
		float k = 1;
		float sum2 = 1;

		while (k <= pow2) {
			sum2 = sum2 * num2;
			k++;
		}
		System.out.println(num2 + " to the power " + pow2 + " is :" + sum2);
		
		


	}

}
