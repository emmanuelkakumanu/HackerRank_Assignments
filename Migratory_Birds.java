import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            cnt1++;
            if(a[i]==2)
            cnt2++;
            if(a[i]==3)
            cnt3++;
            if(a[i]==4)
            cnt4++;
            if(a[i]==5)
            cnt5++;
        }
        int fre[]={cnt1,cnt2,cnt3,cnt4,cnt5};
        int ref=fre[0],ret=1,ind=0;
        for(int i=1;i<5;i++)
        {
            if(ref<fre[i])
            {
                ref=fre[i];
                ret=i+1;
            }
        }

        return ret;




    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
