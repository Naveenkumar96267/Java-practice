import java.util.*;
public class patternbox {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            for(int i=1;i<=n;i++)
            {
                if(j==1 || j==n || i==1 || i==n)
                
                    System.out.print("*");
                
                else 
                    System.out.print(" ");
                
                
            }
            System.out.println();
        }
        
    
    }
}
