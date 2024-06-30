package part7._two_dimensional_array;

import java.io.*;
import java.util.StringTokenizer;

public class test1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());

    int[][] arrA = new int[N][M];
    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arrA[i][j] = Integer.parseInt(str.nextToken());
      }
    }

    int[][] arrB = new int[N][M];
    for (int i = 0; i < N; i++) {
      str = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        arrB[i][j] = Integer.parseInt(str.nextToken());
      }
    }

    int[][] arrResult = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arrResult[i][j] = arrA[i][j] + arrB[i][j];
        System.out.print(arrResult[i][j] + " ");
      }
      System.out.println();

    }
  }
}
