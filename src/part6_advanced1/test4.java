package part6_advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();

    int length = word.length();
    String arr[] = word.split("");

    for (int i = 0; i < length; i++) {
    }
    int a = 1;

    for (int i = 0; i < length / 2; i++) {
      if (arr[i].equals(arr[length - (i + 1)])) {

      } else {
        a = 0;
        break;
      }
    }
    System.out.println(a);
  }
}
