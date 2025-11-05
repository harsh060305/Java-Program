import java.util.*;

public class Foursum{

    public static List<List<Integer>> foursum(int[] nums,int target){

        //have final answer
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            for (int j = i+1; j < n-1; j++) {
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                //these two are act as a pointer
            int k=j+1;
            int l=n-1;

            
            while(k<l){
                long sum=nums[i];
                sum +=nums[j];
                sum +=nums[k];
                sum +=nums[l];

                if(sum>target) {
                    l--;
                }else if(sum<target){
                    k++;
                }else{
                    
                    List<Integer> temp =new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);

                    arr.add(temp);
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1])  k++;
                    while(k<l && nums[l]==nums[l+1])  l--;
                }
            }
            }
            
            
        }return arr; 

    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(foursum(nums,0));
    }
}
