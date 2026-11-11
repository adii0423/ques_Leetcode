import java.util.*;
class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=nums[i+1];
            }else{
                arr[i] = nums[i-1];
            }
        }
        return arr;
    }
}