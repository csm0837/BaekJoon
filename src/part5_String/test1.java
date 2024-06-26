package part5_String;

import java.util.Scanner;

public class test1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int findNum = sc.nextInt() -1;

    char ch = str.charAt(findNum);

    System.out.println(ch);

  }
}

