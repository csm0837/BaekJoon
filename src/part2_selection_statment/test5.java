package part2_selection_statment;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = Integer.parseInt(scan.next());
        int M = Integer.parseInt(scan.next());

        if (M - 45 >= 0) {
            M -= 45;
        } else {
            if (H != 0) {
                H -= 1;
                M += 15;
            } else {
                H = 23;
                M += 15;
            }
        }


        System.out.println(H + " " + M);

    }
}

