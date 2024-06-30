import java.io.IOException;
import java.util.Scanner;

public class timeattack_2 {

  public static void main(String[] args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());

    Scanner sc = new Scanner(System.in);
    int[] score = new int[5];
    int total = 0;

    for (int i = 0; i < 5; i++) {
      score[i] = sc.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      if (score[i] < 40) {
        score[i] = 40;
      }
      total +=score[i];
    }
    System.out.println(total/5);
  }
}


//buffer , string