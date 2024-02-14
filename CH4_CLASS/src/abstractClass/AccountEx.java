package abstractClass;

public class AccountEx {

  public static void main(String[] args) {
    // Cannot instantiate : 인스턴스 생성불가
    //Account account = new Account();

    Account account = new CheckingAccount();
  }
}
