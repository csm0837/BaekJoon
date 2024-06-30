package part7._two_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());
    int[][] background = new int[100][100];

    for (int i = 0; i < count; i++) {
      StringTokenizer str = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(str.nextToken());
      int y = Integer.parseInt(str.nextToken());

      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          background[j][k] = 1;
        }
      }
    }
    int result = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if(background[i][j] == 1){
          result ++;
        }
      }
    }
    System.out.println(result);
  }
}
