package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stArr[] = new Student3[3];
    // 클래스 배열 초기값 ==> null
    //System.out.println(stArr[0].getId());

    Scanner sc = new Scanner(System.in);

    // nullPointerException
    // 초기화를 시켜주는 작업 : 초기화 안해주면 비어있기 때문

    for (int i = 0; i < stArr.length; i++) {
      stArr[i] = new Student3();
    }

    for (int i = 0; i < stArr.length; i++) {
      // 아이디 이름 국어 영어수학 점수 입력 받아서 초기화
      System.out.printf("%d번째 학생 아이디 : \n", i + 1);
      String id = sc.nextLine();

      System.out.printf("%d번째 학생 이름 : \n", i + 1);
      String name = sc.nextLine();

      System.out.printf("%d번째 학생 국어 : \n", i + 1);
      int kor = Integer.parseInt(sc.nextLine());
      // nextInt()는 입력된 숫자와 Enter를 입력하면 Enter를 인식하지 않는다

      System.out.printf("%d번째 학생 영어 : \n", i + 1);
      int eng = Integer.parseInt(sc.nextLine());

      System.out.printf("%d번째 학생 수학 : \n", i + 1);
      int mat = Integer.parseInt(sc.nextLine());

      stArr[i].setId(id);
      stArr[i].setName(name);
      stArr[i].setKor(kor);
      stArr[i].setEng(eng);
      stArr[i].setMat(mat);
    }

    // int sum = 0;
    // for (int i = 0; i < stArr.length; i++) {
    //   sum = stArr[i].getKor() + stArr[i].getEng() + stArr[i].getMat();
    //   System.out.println("총점 : " + sum);
    //   double avg = (double) sum / stArr.length;
    //   System.out.println("평균 : " + avg);
    // }

    // for (int i = 0; i < stArr.length; i++) {
    //   System.out.println(stArr[i].toString());
    // }

    for (Student3 student3 : stArr) {
      int sum = student3.getKor() + student3.getEng() + student3.getMat();
      double avg = (double) sum / stArr.length;
    }
  }
}
