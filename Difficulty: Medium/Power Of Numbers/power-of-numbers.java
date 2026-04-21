class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int MOD = 1000000007;
        int rev =0,temp=n;
        while(temp > 0){
            rev = rev*10 + (temp%10);
            temp /=10;
        }
        long result = 1;
        long base = n;
        while (rev>0){
            if(rev%2==1){
                result=(result*base)%MOD;
            
            }
            base = (base*base)%MOD;
            rev/=2;
        }
        return (int) result;
            

    }
}
