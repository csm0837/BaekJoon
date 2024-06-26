package part4_arrey;

import  java.io.*;
import java.util.StringTokenizer;


public class test5_Re {

  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    StringTokenizer st = new StringTokenizer(br.readLine());



    int basket= Integer.parseInt(st.nextToken());
    int tryCount =Integer.parseInt(st.nextToken());

    int[] arr = new int[basket];

    for (int i = 0; i < tryCount; i++) {
      String str = br.readLine();
      StringTokenizer st2 = new StringTokenizer(str);

      int first =Integer.parseInt(st2.nextToken());
      int last = Integer.parseInt(st2.nextToken());
      int ballNumber = Integer.parseInt(st2.nextToken());

      for (int j = first -1; j <= last -1; j++) {
        arr[j] = ballNumber;
      }
    }
    for(int i = 0; i < basket;i++){
      System.out.printf(arr[i] + " ");
    };
  }
}

//split / tokenizer

