public class Problem3 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;
        int maxPrice = prices[n-1];
        int maxProfit = 0;
        for(int i=n-1; i>=0; i--){
            if(maxPrice - prices[i] > maxProfit){
                maxProfit = maxPrice - prices[i];
            }
            maxPrice = Math.max(maxPrice, prices[i]);
        }
        System.out.println(maxProfit);
    }
}
