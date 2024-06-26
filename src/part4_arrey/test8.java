package part4_arrey;

import java.util.Arrays;
import java.util.Scanner;


public class test8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();
      arr[i] = num % 42;
    }
    Arrays.sort(arr);
    int sum = 1;

    for(int i = 0; i<9;i++){
      if(arr[i] != arr[i+1]){
        sum +=1;
      }
    }

    System.out.println(sum);
  }
}
