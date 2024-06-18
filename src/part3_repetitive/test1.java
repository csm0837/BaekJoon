package part3_repetitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test1 {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int ressult = 0;
            int i = 1;

            while(i<10){
                ressult = i*a;
                System.out.printf("%d * %d = %d\n",a,i,ressult);
                i+=1;
            }


        }
    }
}
