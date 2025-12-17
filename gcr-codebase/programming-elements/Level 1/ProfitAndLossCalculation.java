public class ProfitAndLossCalculation {
    public static void main(String[] args) {
            int costPrice=129;
            int sellingPrice=191;
            //printing the cost price and selling price
            System.out.println("The cost price is INR "+costPrice+" and the selling price is INR "+sellingPrice);
            //calculate the amount of profit
            int profitAmount=sellingPrice-costPrice;
            //calculate the profit percentage
            double profitPercentage=((double) profitAmount /costPrice)*100;
            //print the profit amount and profit percentage
            System.out.println("The profit is INR "+profitAmount+" and the Profit percentage is "+profitPercentage);
    }
}
