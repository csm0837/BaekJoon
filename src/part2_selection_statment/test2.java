package part2_selection_statment;

import java.io.IOException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws IOException {
        {
            Scanner scan = new Scanner(System.in);

            int count = Integer.parseInt(scan.next());
            int i = 1;

            while(i<=count){
                int A = Integer.parseInt(scan.next());
                int B = Integer.parseInt(scan.next());
                System.out.println(A+B);
                i = i+1;
            }

        }
    }

}
