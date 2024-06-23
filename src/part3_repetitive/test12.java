package part3_repetitive;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class test12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean a =true;

        while (a==true) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int A = parseInt(str.nextToken());
            int B = parseInt(str.nextToken());
            int result = A + B;

            if(result !=0) {
            bw.write(result + "\n");
            bw.flush();
            }
            else{
                a = false;
            };
        }
    }
}


//append