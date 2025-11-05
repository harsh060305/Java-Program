public class BuyAndSellStock{

    public static int stock(int[] arr){
        int mp =0;
        int bp =Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(bp<arr[i]){
                int profit=arr[i]-bp; //profit on particular day
                mp=Math.max(profit, mp); //overall profit
            }else bp=arr[i];
            
        }return mp; 
    }
    public static void main(String[] args) {
        int[] arr={7, 6, 4, 3, 1};
        System.out.println(stock(arr));
    }
}