
public class average_of_an_array{
    public static double average(int arr[]){
        int n=arr.length;
        double avg=0;
        int sum=0;        
        
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        return avg;
        
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("average is = "+average(arr));
    }
}