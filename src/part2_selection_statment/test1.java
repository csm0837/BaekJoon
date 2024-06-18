package part2_selection_statment;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A  = Integer.parseInt(scan.next());
        int B  = Integer.parseInt(scan.next());

        if(A>B){
            System.out.println(">");
        }
        else if (A<B){
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }



    }

}
