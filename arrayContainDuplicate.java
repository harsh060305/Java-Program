import java.util.Scanner;

    public class arrayContainDuplicate{
    
        public static boolean calculate(int nums[]) {
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }           
                }
            }return false;
        }
    

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of element : ");
            int n=sc.nextInt();

            int[] arr=new int[n];
            System.out.println("enter the element : ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(calculate(arr));
        }
    }