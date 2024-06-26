package part5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test9_fail {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int numA = Integer.parseInt(st.nextToken());
    String strA = Integer.toString(numA);
    String reverseA = "";
    for (int i = strA.length() - 1; i >= 0; i--) {
      reverseA = reverseA + strA.charAt(i);
    }
    int revA = Integer.parseInt(reverseA);
    System.out.println(revA);

    int numB = Integer.parseInt(st.nextToken());
    String strB = Integer.toString(numB);
    String reverseB = "";
    for (int i = strB.length() - 1; i >= 0; i--) {
      reverseB = reverseB + strB.charAt(i);
    }
    int revB = Integer.parseInt(reverseB);
    System.out.println(revB);

    int maxNum = Math.max(revA, revB);
    System.out.print(maxNum);
  }
}
