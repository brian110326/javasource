package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 2. 문자형 : char, 홑따옴표 '' 사용
        // 문자(한글자) vs 문자열(한글자 이상)
        // 문자 : '' , 문자열 : ""
        // char : 2byte
        char name = 'C';
        String name2 = "Jack";
        char var1 = 65;
        char var2 = '\u0041'; //utf-8 코드값
        char var3 = 44032; //'가'의 코드값
        // 문자에는 코드값이 정의 되어 있음
        // A => 65 : 아스키코드(ASCII)

        System.out.println("나의 이름 : " + name2);
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
    }
}
