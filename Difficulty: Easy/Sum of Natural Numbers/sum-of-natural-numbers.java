import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n==0){
            System.out.println("0");
        } else{
            for(int i=0; i<=n; i++){
                sum = sum+i;
                
            }   System.out.println(sum);
            
            }
    }
}