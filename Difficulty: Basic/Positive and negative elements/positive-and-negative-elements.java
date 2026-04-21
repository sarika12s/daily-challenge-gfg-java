// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) <0){
                neg.add(arr.get(i));
            }
            else pos.add(arr.get(i));
        }
        for(int i=0;i<pos.size();i++){
            ans.add(pos.get(i));
            ans.add(neg.get(i));
        }
        return ans;
    }
}