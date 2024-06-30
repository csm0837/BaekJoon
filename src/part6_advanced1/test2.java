package part6_advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);

    int[] chess = new int[]{1, 1, 2, 2, 2, 8};
    int[] find = new int[chess.length];

    for (int i = 0; i < find.length; i++) {
      find[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < chess.length; i++) {
      int result = chess[i] - find[i];
      System.out.print(result + " ");
    }
  }
}