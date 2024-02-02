package array;

public class ArrayEx1 {

  public static void main(String[] args) {
    // 배열(Array) : 같은 타입의 변수를 하나의 묶음으로 처리
    // int 타입의 변수 5개 필요
    // 타입[] 배열명 = new 타입[길이]
    // 배열 선언, 생성 ==> 자동으로 초기화

    int[] arr1 = new int[5]; // 0으로 초기화
    float arr2[] = new float[10]; // 0.0으로 초기화
    boolean arr3[] = new boolean[4]; // false로 초기화
    char[] arr4 = new char[3]; // 공백으로 초기화

    int i = 1;

    System.out.println(arr1);
    // [I@7a81197d ==> 주소값

    // 초기화 하지 않았지만 arr1[0] == 0이 나옴
    System.out.println(arr1[0]); //배열 값 확인
    System.out.println(i);
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
  }
}
