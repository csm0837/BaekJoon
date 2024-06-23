package part3_repetitive;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = parseInt(br.readLine());

        for (int i = 1; i < total + 1; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int x = parseInt(str.nextToken());
            int a = parseInt(str.nextToken());
            int result = x + a;
            bw.write(String.format("Case #%d: %d + %d = %d\n", i, x, a, result));
        }
        bw.flush();
        bw.close();
    }
}