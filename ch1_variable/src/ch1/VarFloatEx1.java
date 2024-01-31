package ch1;

/* 변수 : 하나의 값을 저장하기 위한 공간
 *        타입 지정 : 정수형, 문자형, 실수형, 논리형
 *        값은 변할 수 있다
 *        1byte == 8bit (256가지) : 0 ~ 255 => -128 ~ 127
 * 
 * 상수 : 값을 한번만 저장하는 공간
 *       final int PI = 3.14
 */

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 4. 실수형 : float(4byte), double(8byte)
        float score1 = 90.5f; 
        double score2 = 98.5d;

        System.out.println("score1 : " + score1);
        System.out.println("score2 : " + score2);

        float var3 = 0.123456789223432f;
        double var4 = 0.123456789223432d;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }
}
