package part5_String;

import java.util.Scanner;

public class test8 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String[] str2 = str.split(" ");


    int count = 0;
    for (int i = 0; i < str2.length; i++) {
      if (!str2[i].equals("")) {
        count++;
      }
    }

    System.out.println(count);
  }
}

//1. 숫자를 입력받음
//2. for 문을 사용해서 위에 입력받은 수만큼 반복
// 반복횟수를 입력박음
//각 입력의 길이만큼 배열을 만들고 각배열의 [0][1][2]별로 for으로 반복
//
//
//
//