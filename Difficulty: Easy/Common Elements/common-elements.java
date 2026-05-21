// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList <Integer> nums = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int j = 0;
        for(int i = 0; i < a.length; i++){
            while(b.length > j){
                if(a[i] < b[j]){
                    break;
                }
                else if(a[i] == b[j]){
                    nums.add(a[i]);
                    j++;
                    break;
                }
                j++;
            }
        }
        
        return nums;
        
    }
}