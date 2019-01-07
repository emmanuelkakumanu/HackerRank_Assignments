import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int T=0;T<t;T++)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            int sum=0;
            
            for(int i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                {
                    sum=sum+a[i];
                }
            }
            System.out.println(sum);
        }
    }
}
