package Leetcodeproblems;

public class BestTimeToBuySellStock {
	
	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		//int [] prices = {7,6,4,4,1};
		int output = maxPrice(prices);
		System.out.println(output);
	}
	
	
	private static int maxPrice(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}
			else {
				int profit = prices[i]-  minPrice;
				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

}
