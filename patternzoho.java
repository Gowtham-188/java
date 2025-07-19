
import java.util.Scanner;

public class patternzoho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();

    int max= (n/2)+ d;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(max - Min(Min(i,j),Min(n-i-1,n-j-1)) +" ");
            }
            System.out.println();
        }
    }
    public static int Min(int a,int b)
    {
          return a<b?a:b;
    }
    
}
