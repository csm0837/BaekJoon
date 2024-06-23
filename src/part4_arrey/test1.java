package part4_arrey;

import java.util.Scanner;

public class test1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int count = 0;
    int N = sc.nextInt();
    int[] list = new int[N];

    for (int i = 0; i < N; i++) {
      list[i] = sc.nextInt();
    }
    int b = sc.nextInt();

    for (int j = 0; j < list.length; j++) {
      if (b == list[j]) {
        count++;
      }
    }
    System.out.println(count);
  }
}