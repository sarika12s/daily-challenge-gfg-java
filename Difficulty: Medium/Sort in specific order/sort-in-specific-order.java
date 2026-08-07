
class Solution {
    public void sortIt(int[] arr) {
        ArrayList<Long>odd=new ArrayList<>();
        ArrayList<Long>even=new ArrayList<>();
        for(long num:arr){
            if(num%2!=0){
                odd.add(num);
                
            }else{
                even.add(num);
            }
        }
            Collections.sort(odd,Collections.reverseOrder());
            Collections.sort(even);
            int index=0;
            for(long num:odd){
                arr[index++]=(int)num;
            }for(long num:even){
                arr[index++]=(int)num;
            }
        
        
        
    }
}
