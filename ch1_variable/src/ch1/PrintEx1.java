package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        // 화면 출력
        int var1 = 35;
        int var2 = 25;
        boolean flag = true;
        System.out.printf("var1 = %5d, var2 = %05d", var1, var2);
        System.out.println();

        System.out.printf("flag = %b",flag);
        System.out.println();

        double num1 = 3.14;
        System.out.printf("num1 = %f",num1);
        System.out.println();

        // printf 지시자
        // %d : 10진 정수형
        // %b : 논리형
        // %c : char형
        // %s : String형
        // %f : 부동소수점(float, double)
        // %숫자d : 총자릿수

        float f1 = 3.141592f;
        double d1 = 31.41592d;
        System.out.printf("f1 = %.5f\n",f1);
        System.out.printf("d1 = %5.3f\n",d1); // %5.3f ==> 총 5자리, 소수점은 3자리까지만
    }
}
