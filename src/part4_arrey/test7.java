package part4_arrey;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class test7 {

    public static void main (String[]args){

      Scanner sc = new Scanner(System.in);

      int[] arr = new int[30];

      for (int i = 0; i < 28; i++) {
        int num = sc.nextInt();
        arr[num - 1] = 1;
      }

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 1) {
          System.out.println(i + 1);
        }
      }
      System.out.println("가나다라");

    }
  }
