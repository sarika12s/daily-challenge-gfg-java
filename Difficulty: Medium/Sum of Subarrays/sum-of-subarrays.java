class Solution {
    public int subarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int leftChoices = i + 1;
            int rightChoices = n - i;
            int frequency = leftChoices * rightChoices;
            int contribution = arr[i] * frequency;
            sum += contribution;
        }

        return sum;
    }

  
}

