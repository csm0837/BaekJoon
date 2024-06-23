package part3_repetitive;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = parseInt(str);
        int repeat;
        int i = 0;

        if(N%4 == 0){
            repeat = N/4;
        }
        else{
            repeat = N/4+1;
        }

        while(i<repeat){
            System.out.print("long ");
            i+=1;
        }
        System.out.print("int");
    }
}
