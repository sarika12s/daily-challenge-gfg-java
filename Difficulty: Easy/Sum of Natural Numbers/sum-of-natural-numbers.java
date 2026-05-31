// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturals(5)); 
    }
}
