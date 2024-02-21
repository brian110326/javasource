package practice;

import java.util.List;
import java.util.Scanner;

public class PracticeMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    PracticeDAO dao = new PracticeDAO();

    while (run) {
      System.out.println("==============================================");
      System.out.println("1. 특정 도서 조회");
      System.out.println("2. 전체 도서 조회");
      System.out.println("3. 도서 입력");
      System.out.println("4. 도서 정보 수정");
      System.out.println("5. 도서 삭제");
      System.out.println("6. 종료");
      System.out.println("==============================================");
      System.out.println("메뉴 선택 : ");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          System.out.println("code 입력 : ");
          int searchCode = Integer.parseInt(sc.nextLine());
          PracticeDTO dto = dao.getRow(searchCode);
          System.out.println(dto);

          break;
        case 2:
          List<PracticeDTO> list = dao.getRows();
          for (PracticeDTO d : list) {
            System.out.println(d);
          }
          break;
        case 3:
          System.out.println("code 입력 : ");
          int code = Integer.parseInt(sc.nextLine());
          System.out.println("title 입력 : ");
          String title = sc.nextLine();
          System.out.println("writer 입력 : ");
          String writer = sc.nextLine();
          System.out.println("price 입력 : ");
          int price = Integer.parseInt(sc.nextLine());

          PracticeDTO dto3 = new PracticeDTO(code, title, writer, price);
          System.out.println(dao.insert(dto3) > 0 ? "입력 성공" : "입력 실패");
          break;
        case 4:
          System.out.println("code 입력 : ");
          int newCode = Integer.parseInt(sc.nextLine());
          System.out.println("price 입력 : ");
          int newPrice = Integer.parseInt(sc.nextLine());

          System.out.println(
            dao.update(newCode, newPrice) > 0 ? "수정 성공" : "수정 실패"
          );
          break;
        case 5:
          System.out.println("code 입력 : ");
          int deleteCode = Integer.parseInt(sc.nextLine());

          System.out.println(
            dao.delete(deleteCode) > 0 ? "삭제 성공" : "삭제 실패"
          );

          break;
        case 6:
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
