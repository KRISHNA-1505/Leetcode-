class Solution {
    public int addDigits(int num) {
        int rem=0,rev=0,s=10;
        if(num<10)
        {
            return num;
        }
       
        while(num>=10)
        {
            s=0;
            while(num!=0)
            {
                rem=num%10;
                s+=rem;
                num/=10;
            }
            num=s;
        }
        return num;
    }

}