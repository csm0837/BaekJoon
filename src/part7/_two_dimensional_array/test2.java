package part7._two_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = Integer.MIN_VALUE; //형식의 최솟값
    int countI = 0;
    int countJ = 0;

    int[][] nineNine = new int[9][9];
    for (int i = 0; i < 9; i++) {
      StringTokenizer str = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        nineNine[i][j] = Integer.parseInt(str.nextToken());
        if (max < nineNine[i][j]) {
          max = nineNine[i][j];
          countI = i + 1;
          countJ = j + 1;
        }
      }
    }
    System.out.println(max);
    System.out.println(countI + " " + countJ);


  }
}
