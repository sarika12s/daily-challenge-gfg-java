
class Solution {
    public void printPattern(int n) {
        for(int i= 1; i<=n;i++)
        {
            if(i!=n){
            for(int j = 1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            }
            else{
                for(int j = 1; j<=i;j++)
                {
                    String p = (j==i)?"*":"* ";
                    System.out.print(p);
                }
            }
            System.out.println();
        }
    }
}

