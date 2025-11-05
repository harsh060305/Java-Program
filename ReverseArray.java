
import java.util.Arrays;

class ReverseArray{
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6};
        // int temp=0;
        // int n=arr.length;
        // for(int i=0;i<(n/2);i++){
        //     temp=arr[i];
        //     arr[i]=arr[n-1-i];
        //     arr[n-1-i]=temp;
        // }System.out.println(Arrays.toString(arr));

        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
            i++;
            j--;
        }System.out.println(Arrays.toString(arr));

    }
}
