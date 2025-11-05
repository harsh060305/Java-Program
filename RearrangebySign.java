import java.util.*;

public class RearrangebySign {

    public static int[] arrange(int arr[],int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }for(int j=0;j<n/2;j++){
            arr[2*j]=pos.get(j);
            arr[2*j+1]=neg.get(j);
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr={5,-9,6,7,5,-9,-8,-1};
        int n=arr.length;
        int[] array=arrange(arr,n);
        System.out.println("After rearrange array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
        }

    }
    
}
