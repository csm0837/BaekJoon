package part4_arrey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int subjectCount = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] scores = new int[subjectCount];
    int max = 0;

    for (int i = 0; i < subjectCount; i++) {
      scores[i] = Integer.parseInt(st.nextToken());
      if (scores[i] > max) {
        max = scores[i];
      }
    }

    double sum = 0;
    for (int i = 0; i < subjectCount; i++) {
      sum += (double) scores[i] / max * 100;
    }

    System.out.println(sum / subjectCount);
  }
}
