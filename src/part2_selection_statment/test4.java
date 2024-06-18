package part2_selection_statment;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x  = Integer.parseInt(scan.next());
        int y  = Integer.parseInt(scan.next());

        if (x>0){
            if(y>0){
                System.out.println("1");
            }
            else{
                System.out.println("4");
            }
        }
            else {if(y>0){
            System.out.println("2");
            }
            else{
            System.out.println("3");
            }
        }
    }
}
