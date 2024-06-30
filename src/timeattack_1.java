import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class timeattack_1 {

  public static void main(String[] args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());

    Scanner sc = new Scanner(System.in);
    int[] price = new int[5];

    for (int i = 0; i < 5; i++) {
      price[i] = sc.nextInt();
    }

    int burgerMin = price[0];
    for (int i = 1; i < 3; i++) {
      burgerMin = Math.min(burgerMin, price[i]);
    }

    int drinkMin = price[3];
    for (int i = 4; i < 5; i++) {
      drinkMin = Math.min(drinkMin, price[i]);
    }
    System.out.println(burgerMin + drinkMin - 50);

  }
}
