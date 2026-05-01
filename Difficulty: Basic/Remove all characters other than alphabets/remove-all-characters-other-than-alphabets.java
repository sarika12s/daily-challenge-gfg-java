// User function Template for Java



class Solution {
    String removeSpecialCharacter(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append(s.charAt(i));
            }
        }
        return sb.length()==0 ? "-1" : sb.toString();
    }
}