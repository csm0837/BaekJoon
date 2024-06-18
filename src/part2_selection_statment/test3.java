package part2_selection_statment;

import java.util.Scanner;

public class test3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year  = Integer.parseInt(scan.next());


        if((year%4==0)&&(year%100!=0)){
            System.out.println("1");
        }

        else if((year%4==0)&&(year%400==0)) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }


    }
}
