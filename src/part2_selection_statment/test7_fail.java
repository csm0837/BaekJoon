package part2_selection_statment;

import java.io.*;
import java.util.StringTokenizer;

public class test7_fail
{
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int score;

            if(a==b&&b==c){
                score = 10000 + a*1000;
            }
            else if (a != b && b!= c && c!=a) {
                score = 0;

            }
        }
    }
}//Math.mas(a,b) = a,b 중 최대갓ㅂ