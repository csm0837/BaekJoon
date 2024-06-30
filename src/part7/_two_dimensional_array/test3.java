package part7._two_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[][] word = new char[5][15];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 15; j++) {
        word[i][j] = '*';
      }
    }

    for (int i = 0; i < 5; i++) {
      String line = br.readLine();
      for (int j = 0; j < line.length(); j++) {
        word[i][j] = line.charAt(j);
      }
    }

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        if (word[j][i] != '*') {
          System.out.print(word[j][i]);
        }
      }
    }
  }
}
