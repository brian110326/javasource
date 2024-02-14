package ch4;

import java.util.Scanner;

public class StudentEx3 {

  public static void main(String[] args) {
    Student2 stArr[] = new Student2[3];
    // stArr[0] = new Student2("st1", "A", "Kor");
    // stArr[1] = new Student2("st2", "B", "Us");
    // stArr[2] = new Student2("st3", "C", "Uk");

    // // 첫번째 학생 휴대폰 번호 등록
    // stArr[0].setHp("010-1111-2222");

    // stArr[2].changeAddr("Aus");

    // 학생 정보를 입력받기
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < stArr.length; i++) {
      System.out.printf("%d번째 학생 Input Id : \n", i + 1);
      String id = sc.nextLine();

      System.out.printf("%d번째 학생 Input Name : \n", i + 1);
      String name = sc.nextLine();

      System.out.printf("%d번째 학생 Input Addr : \n", i + 1);
      String addr = sc.nextLine();

      stArr[i] = new Student2(id, name, addr);
    }

    for (Student2 student2 : stArr) {
      System.out.println(student2);
    }
  }
}
