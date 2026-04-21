class Solution {
    public boolean isPalindrome(int n) {
        int original = n;
        n = Math.abs(n);
        int reversed= 0;
        int temp=n;
        while(temp!=0){
            int digit = temp%10;
            reversed=(reversed*10)+digit;
            temp=temp/10;
        
        }
            return n == reversed;
        
        
        
    }
}