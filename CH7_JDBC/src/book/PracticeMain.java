package book;

import java.util.List;
import java.util.Scanner;

public class PracticeMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    PracticeDAO dao = new PracticeDAO();

    while (run) {
      System.out.println(
        "=============================================================================="
      );
      System.out.println("1. 특정 도서 조회");
      System.out.println("2. 전체 도서 조회");
      System.out.println("3. 도서 입력");
      System.out.println("4. 도서 정보 수정");
      System.out.println("5. 도서 삭제");
      System.out.println("6. 종료");
      System.out.println(
        "=============================================================================="
      );

      System.out.println("메뉴 입력 : ");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          System.out.println("code 입력 : ");
          int code = Integer.parseInt(sc.nextLine());
          PracticeDTO dto = dao.getRow(code);
          System.out.println(dto);
          break;
        case 2:
          List<PracticeDTO> list = dao.getRows();
          for (PracticeDTO dto2 : list) {
            System.out.println(dto2);
          }
          break;
        case 3:
          System.out.println("code 입력 : ");
          int newCode = Integer.parseInt(sc.nextLine());
          System.out.println("title 입력 : ");
          String newTitle = sc.nextLine();
          System.out.println("writer 입력 : ");
          String newWriter = sc.nextLine();
          System.out.println("price 입력 : ");
          int newPrice = Integer.parseInt(sc.nextLine());

          PracticeDTO insertdto = new PracticeDTO(
            newCode,
            newTitle,
            newWriter,
            newPrice
          );
          int result = dao.insert(insertdto);
          System.out.println(result > 0 ? "입력 성공" : "입력 실패");
          break;
        case 4:
          System.out.println("code 입력 : ");
          int updateCode = Integer.parseInt(sc.nextLine());
          System.out.println("price 입력 : ");
          int updatePrice = Integer.parseInt(sc.nextLine());

          PracticeDTO updatedto = new PracticeDTO();
          updatedto.setPrice(updatePrice);
          updatedto.setCode(updateCode);
          System.out.println(
            dao.update(updatedto) > 0 ? "수정 성공" : "수정 실패"
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
