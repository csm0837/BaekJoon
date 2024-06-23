package part3_repetitive;

import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = parseInt(br.readLine());

        for (int i = 0;i < total; i++) {

            StringTokenizer str = new StringTokenizer(br.readLine());

            int x = parseInt(str.nextToken());
            int a = parseInt(str.nextToken());

            bw.write(x+a+"\n");
        }
        bw.flush();
        bw.close();
    }
}