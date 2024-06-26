package part5_String;

import java.util.Scanner;

public class test5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    sc.nextLine();

    String str = sc.nextLine();
    char ch = str.charAt(0);
    int sum = 0;

    for (int i = 0; i < num; i++) {
      sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    System.out.println(sum);

  }
}
