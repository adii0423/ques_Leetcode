class Solution {
    public int addDigits(int num) {
        int sum=0;
        int temp;
        if(num<9){
            return num;
        }
        else{
        while(num>9){
            temp=num%10;
            num=num/10;
            num=num+temp;
        }
        }
        return num;
        }
    }
