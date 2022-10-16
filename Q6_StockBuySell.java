public class Q6_StockBuySell {
    public static void main(String[] args) {
        Q6_StockBuySell s=new Q6_StockBuySell();
        int a[]={7,1,5,3,6,4};
        int  c=s.Profit(a);
        System.out.println(c);
    }
    public int Profit(int [] price){
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int p:price){
            if(p<min_price)
                min_price=p;
            else if (p-min_price>max_profit) {
                max_profit=p-min_price;
            }
        }
        return max_profit;
    }
}

