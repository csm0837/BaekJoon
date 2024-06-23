package part3_repetitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int total = parseInt(str);

        int sum = 0;


        for (int i = 0;i < total; i++) {

            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int x = parseInt(st.nextToken());
            int a = parseInt(st.nextToken());

            System.out.println(x+a);
        }
    }
}