class Solution {
    public int rowWithMax1s(int[][] arr) {
        int mx=0;
                int answer=-1;
                for(int i=0; i<=arr.length-1; i++){
                    int c=0;
                    for(int j=0; j<arr[i].length; j++){
                        c=c+arr[i][j];
                        if(c>mx){
                            mx=c;
                            answer=i;
                        }
                    }

                }
                return answer;
        
        
    }
}