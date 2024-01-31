package operator;

// 단항 연산자 : 부호 => 양 / 음수 , 증감연산자 => ++, --
//               ++ => 변수 + 1, -- => 변수 - 1, 논리부정연산자 : ! (t->f, f->t)
public class DenyLogicEx1 {

  public static void main(String[] args) {
    //boolean 형태로 나오는 변수에 사용
    boolean play = true;
    System.out.println(play);
    System.out.println(!play);
  }
}
