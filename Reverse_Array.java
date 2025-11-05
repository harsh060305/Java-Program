public class Reverse_Array {

    public static void rev(int[] arr,int i,int j){
        int temp;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void print(int[] arr,int n){
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,8,9,4,7};
        int j=arr.length-1;
        System.out.println("original array is : ");
        print(arr,arr.length);
        
        
        rev(arr,0,j);
        System.out.println("new array is : ");
        print(arr,arr.length);
    }
    
}
