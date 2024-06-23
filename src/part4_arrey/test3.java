package part4_arrey;

import java.util.Arrays;
import java.util.Scanner;


public class test3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] arr = new int[N];

    for(int i = 0; i <N; i++){
      arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int min = arr[0];


    Arrays.sort(arr);


    System.out.println(arr[0]);
    System.out.println(arr[N-1]);



//    for(int i = 0; i < arr.length; i++){
//      if(arr[i] < X){
//        System.out.print(arr[i] + " ");
//      }
//    }
  }
}