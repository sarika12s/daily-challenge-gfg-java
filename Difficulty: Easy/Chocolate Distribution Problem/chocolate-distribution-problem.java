class Solution {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0; i+m-1<arr.length; i++){
            int smallestValue=arr[i];
            int largesValue=arr[i+m-1];
            int diff=largesValue-smallestValue;
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
        
    }
}