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
            int n=s.nextInt();
            String arr[]=new String[n];
            ArrayList<String> re=new ArrayList<>();
            for(int i=0;i<n;i++)
                arr[i]=s.next();
            for(int i=0;i<n;i++)
            {
                int cnt=1;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i].equals(arr[j]))
                        cnt++;
                }
                if(cnt==1)
                {
                    re.add(arr[i]);
                }
            }
            Collections.sort(re);
            for(int i=0;i<re.size();i++)
            {
                System.out.println(re.get(i));
            }
            
            
        }
    }
}
