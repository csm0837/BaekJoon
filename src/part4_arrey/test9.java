package part4_arrey;

import java.io.*;
import java.util.*;

public class test9 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int basket = Integer.parseInt(st.nextToken());
    int tryCount = Integer.parseInt(st.nextToken());

    int[] arr1 = new int[basket];
    for (int i = 0; i < basket; i++) {
      arr1[i] = i + 1;
    }

    for (int i = 0; i < tryCount; i++) {
      st = new StringTokenizer(br.readLine());
      int first = Integer.parseInt(st.nextToken()) - 1;
      int last = Integer.parseInt(st.nextToken()) - 1;

      // for문을 사용하여 배열의 일부분을 역순으로 정렬
      for (int j = 0; j <= (last - first) / 2; j++) {
        int temp = arr1[first + j];
        arr1[first + j] = arr1[last - j];
        arr1[last - j] = temp;
      }
    }

    for (int i = 0; i < basket; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
}
