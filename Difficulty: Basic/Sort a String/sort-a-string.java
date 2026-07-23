class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<26; i++){
            while(count[i]>0){
                result.append((char)(i+'a'));
                count[i]--;
            }
        }
        return result.toString();
        
      
        
    }
}