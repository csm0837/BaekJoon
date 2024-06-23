package part3_repetitive;

import java.io.*;

import static java.lang.Integer.parseInt;

public class test9_faile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        int i=1;


        while (i < N+1) {
            if (i ==N) {
                System.out.println("i = N");
            }

            else {
                System.out.printf("*");
                i= i+1;
            }

        }
    }
}
