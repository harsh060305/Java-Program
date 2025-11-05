import java.util.*;

public class ThreeSum{

    public static List<List<Integer>> threeSum(int[] nums){

        //have final answer
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            //these two are act as a pointer
            int j=i+1;
            int k=n-1;

            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum>0) {
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    arr.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])  j++;
                    while(j<k && nums[k]==nums[k+1])  k--;
                }
            }
            
        }return arr; 

    }
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
}
