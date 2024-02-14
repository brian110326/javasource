package exception;

import java.util.Scanner;

public class LoginEx {

  public static void main(String[] args) {
    // 사용자로부터 아이디와 비밀번호를 입력받기
    Scanner sc = new Scanner(System.in);

    System.out.println("ID 입력 : ");
    String id = sc.nextLine();

    System.out.println("PWD 입력 : ");
    String pwd = sc.nextLine();
    // 아이디가 blue와 일치하지 않으면 NoExistidException 발생

    // 비밀번호가 12345와 일치하지 않으면 WrongPasswordException 발생

    try {
      login(id, pwd);
    } catch (NotExistidException | WrongPasswordException e) {
      e.printStackTrace();
    }
  }

  public static void login(String id, String pwd)
    throws NotExistidException, WrongPasswordException {
    // 여기서 아이디 비밀번호 확인
    if (!id.equals("blue")) {
      throw new NotExistidException("ID 확인");
    }

    if (!pwd.equals("12345")) {
      throw new WrongPasswordException("PWD 확인");
    }
  }
}
