
import java.util.*;

public class MajorityeleNNN {
    public static List<Integer> majorityElement(int []nums) {
        int n=nums.length;
        int ct1=0,ct2=0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(ct1==0 && nums[i]!=el2){
                ct1=1;
                el1=nums[i];
            }
            else if(ct2==0 && nums[i]!=el1){
                ct2=1;
                el2=nums[i];
            }
            else if(nums[i] == el1) ct1++;
            else if(nums[i]==el2) ct2++;
            else{
                ct1--;
                ct2--;
            }
            
        }
        ct1=0;ct2=0;
        List<Integer> ls=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(nums[i]==el1) ct1++;
            if(nums[i]==el2) ct2++;
            
        }int temp=(int)(n/3+1);
        if(ct1>=temp) ls.add(el1);
        if(ct2>=temp) ls.add(el2);
        return ls;
        
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
       
        System.out.println(majorityElement(arr));
    }
}

