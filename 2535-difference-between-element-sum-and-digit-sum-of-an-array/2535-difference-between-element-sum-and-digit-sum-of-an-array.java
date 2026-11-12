import java.util.*;
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int elementSum=0;
        int digitSum=0;
        int temp;


        for(int i=0;i<n;i++){
            elementSum+=nums[i];
        }
        for(int i=0;i<n;i++){
            while(nums[i]>9){
                temp=nums[i]%10;
                digitSum+=temp;
                nums[i]=nums[i]/10;
            }
            digitSum+=nums[i];
        }
        int res=Math.abs(elementSum-digitSum);
    return res;
    }
}