package part6_advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine().toUpperCase(); // 모두 대문자로 바꿈

    int[] count = new int[26];

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if ('A' <= ch && ch <= 'Z') {
        count[ch - 'A']++;
      }
    }

    int maxCount = 0;
    char result = '?'; // 초기값 '?'

    // 가장 많이 등장한 알파벳 찾기
    for (int i = 0; i < 26; i++) {
      if (count[i] > maxCount) {
        maxCount = count[i];
        result = (char) (i + 'A');
      }
    }

    if (result != 0){
      System.out.println(result);
    }
    else{
      System.out.println("?");
    }
  }
}
