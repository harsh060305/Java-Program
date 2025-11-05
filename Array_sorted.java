import java.util.Scanner;

    class Array_sorted{

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array");    
            int n=sc.nextInt(); 
        
            System.out.println("enter the element of array");  
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            

            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("Sorted array is : ");
            for(int j=0;j<n;j++){
                System.out.println(arr[j]);
            }

        }
    }        