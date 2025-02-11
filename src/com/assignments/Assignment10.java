package com.assignments;

import java.util.Arrays;

//mport java.sql.Array;

public class Assignment10 {

	public static void main(String[] args) {

		int ar[] = { 7, 1, 5, 3, 6, 4, };
		Arrays.sort(ar);
		int length = ar.length;

		int price = ar[length - 6];
		int price2 = ar[length - 2];
		int profit = price2 - price;
		for (int i = 1; i <= ar.length; i++) {
			if (price <= (ar[length - 1])) {
				System.out.println("buy the stock now the stock proce is : " + price);
				
			}

			else {
				System.out.println("don't buy the stock");
			}

			if (price2 <= (ar[length - 1])) {
				System.out.println("sell the stock now the stock proce is : " + price2);
				System.out.println("buy the stock at ruppee " + price + " and sell at ruppee " + price2
						+ " Total profit in this transction is: " + profit);

				break;
			}

		}

	}

}
