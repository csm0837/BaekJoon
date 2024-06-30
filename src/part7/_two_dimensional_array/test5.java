package part7._two_dimensional_array;
import java.util.Scanner;

public class test5 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


      String word = sc.next().toUpperCase();


      int[] alphabetCount = new int[26];


      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        alphabetCount[ch - 'A']++;
      }

      int maxCount = -1;
      char mostaplha = '?';
      for (int i = 0; i < 26; i++) {
        if (alphabetCount[i] > maxCount) {
          maxCount = alphabetCount[i];
          mostaplha = (char) (i + 'A');
        } else if (alphabetCount[i] == maxCount) {
          mostaplha = '?';
        }
      }


      System.out.println(mostaplha);

      sc.close();
    }
  }

