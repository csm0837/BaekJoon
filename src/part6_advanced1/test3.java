package part6_advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {

      for (int j = 0; j < N - 1 - i; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < 1 + 2 * i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < N; i++) {

      for (int j = N; j >= N - i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < (N+2- 2*k); k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
