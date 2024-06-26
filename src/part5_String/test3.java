package part5_String;

import java.util.Scanner;

public class test3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.nextLine();

    for (int i = 1; i <= num; i++) {
      String str = sc.nextLine();
      System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));
    }
  }
}
