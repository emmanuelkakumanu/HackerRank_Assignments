import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int t=0;t<T;t++)
        {
                long n=s.nextLong();
                long f1=1,f2=1,f3=2,next=0;
                if(n==1 || n==2)
                {
                    next=1;
                    
                }
                if(n==3)
                {
                    next=2;
                }
                for(int i=3;i<n;i++)
                {
                    next=(f1+f2+f3)%1000000007;
                    f1=f2;
                    f2=f3;
                    f3=next;
                }
                System.out.println(next);
        }
    }
}
