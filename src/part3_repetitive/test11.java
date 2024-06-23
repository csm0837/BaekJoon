package part3_repetitive;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean a = true;

        while (a == true) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int A = parseInt(str.nextToken());
            int B = parseInt(str.nextToken());
            int result = A + B;

            System.out.println(result);
        }

        br.close();
    }
}


//stream builder