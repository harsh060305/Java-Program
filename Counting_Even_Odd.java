public class Counting_Even_Odd{
    public static void count(int arr[]){
        int count_even=0;
        int count_odd=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count_even++;
            }else
            {
                count_odd++;
            }
        }System.out.println("no. of even element"+count_even);
        System.out.println("no. of odd element"+count_odd);
        
    }

    public static void main(String[] args){
        int[] arr={6,5,2,3,8,9};
        count(arr);
    }
}