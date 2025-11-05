import java.util.Scanner;

public class Majority_ElementNN {

    public static int majority(int[] nums){
        int n=nums.length;
        int count=0;
        int el=0;
        for (int i = 0; i < n; i++) {
            if(count==0){
                count=1;
                el=nums[i];
            }else if(el==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==el){
                count1++;
            }
            
        }
        if(count1>n/2){
            return el;
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Majority element is : "+ majority(arr));
    }
}
