package part5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test6_re {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    String input = br.readLine();


    int[] alphabet = new int[26];
    Arrays.fill(alphabet,-1);


    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      int list = ch - 'a';

      if (alphabet[list] == -1) {
        alphabet[list] = i;
      }
    }


    for (int i = 0; i < alphabet.length; i++) {
      System.out.print(alphabet[i] + " ");
    }
  }
}
