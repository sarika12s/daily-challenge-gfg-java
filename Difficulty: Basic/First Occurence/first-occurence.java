class Solution {
    int firstOccurence(String txt, String pat) {
            char[] a = txt.toCharArray();
    char[] b = pat.toCharArray();
    
    for (int i = 0; i <= a.length - b.length; i++) {
    
    int j;
    
    for (j = 0; j < b.length; j++) {
    
    if (a[i + j] != b[j]) {
    break;
    }
    }
    
    if (j == b.length) {
    return i;
    }
    }
    
    return -1;
        
    }
}