package part4_arrey;

import java.util.Scanner;


public class test8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[11];
    System.out.println();

    for (int i = 0; i <= 15 ; i++) {

      int num = sc.nextInt();
      arr[i] = num % 42;
      System.out.println(arr[i]);
    }
  }
}
