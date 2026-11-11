class Solution {
    public int countDigits(int num) {
        int val;
        int count=0;
        int temp=num;

        while(num>0){
            val=num%10;
            if(temp%val==0){
                count+=1;   
            }
            num=num/10;
        }
        return count;
    }
}