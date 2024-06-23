package part4_arrey;

import java.util.*;
import java.io.*;



public class test6 {

  public static void main(String[] args) throws IOException{

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int arr[] = new int[N];
    int M = sc.nextInt();
    int temp;

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    for(int j = 0; j < M; j++) {
      int k = sc.nextInt();
      int l = sc.nextInt();

      temp = arr[k -1];
      arr[k -1] = arr[l -1];
      arr[l -1] = temp;
    }
    for(int k = 0; k <arr.length; k++) {
      System.out.print(arr[k] + " ");
    }
  }
}