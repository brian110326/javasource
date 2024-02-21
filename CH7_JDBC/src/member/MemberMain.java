package member;

import book.BookDAO;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    MemberDAO memberDAO = new MemberDAO();

    while (run) {
      System.out.println("=====================================");
      System.out.println("1. 전체 회원 조회");
      System.out.println("2. 개별 회원 조회");
      System.out.println("3. 회원 추가");
      System.out.println("4. 회원 수정");
      System.out.println("5. 회원 삭제");
      System.out.println("6. 종료");
      System.out.println("=====================================");

      System.out.print("메뉴 입력 >> ");
      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          System.out.println("\n**** 전체 회원 조회 ****");
          System.out.println("아이디\t비밀번호\t이름\t이메일");
          List<MemberDTO> list = memberDAO.getRows();
          for (MemberDTO memberDTO : list) {
            System.out.print(memberDTO.getUserId() + "\t");
            System.out.print(memberDTO.getPassword() + "\t");
            System.out.print(memberDTO.getName() + "\t");
            System.out.print(memberDTO.getEmail() + "\t");
            System.out.println();
          }
          System.out.println();
          break;
        case 2:
          //아이디, 비밀번호 입력받은 후 dao메소드 호출 결과출력
          System.out.println("\n**** 회원 조회 ****");
          System.out.print("아이디 : ");
          String userId = sc.nextLine();
          System.out.print("비밀번호 : ");
          String password = sc.nextLine();

          MemberDTO readDto = new MemberDTO();
          readDto.setUserId(userId);
          readDto.setPassword(password);

          MemberDTO row = memberDAO.getRow(userId, password);

          System.out.println("\n\n==== 조회 회원 정보 ====");
          System.out.println("아이디 : " + row.getUserId());
          System.out.println("비밀번호 : " + row.getPassword());
          System.out.println("이름 : " + row.getName());
          System.out.println("이메일 : " + row.getEmail());
          System.out.println();

          break;
        case 3:
          System.out.println("\n**** 회원 추가 ****");
          System.out.println("userid 입력 : ");
          String userid = sc.nextLine();
          System.out.println("password 입력 : ");
          String pwd = sc.nextLine();
          System.out.println("name 입력 : ");
          String name = sc.nextLine();
          System.out.println("email 입력 : ");
          String email = sc.nextLine();

          MemberDTO insertDTO = new MemberDTO(userid, pwd, name, email);
          System.out.println(
            memberDAO.insert(insertDTO) > 0 ? "입력 성공" : "입력 실패"
          );
          break;
        case 4:
          System.out.println("\n**** 회원 수정 ****");
          System.out.println("userid 입력 : ");
          String updateId = sc.nextLine();
          System.out.println("기존 password 입력 : ");
          String changePwd = sc.nextLine();
          System.out.println("password 입력 : ");
          String newPwd = sc.nextLine();

          // 아이디와 기존비밀번호로 조회시 회원이 존재하면 수정
          MemberDTO rwoMem = memberDAO.getRow(updateId, changePwd);
          if (rwoMem == null) {
            System.out.println("입력 정보가 일치하지 않습니다");
          } else {
            System.out.println(
              memberDAO.update(updateId, newPwd) > 0 ? "수정 성공" : "수정 실패"
            );
          }

          break;
        case 5:
          System.out.println("\n**** 회원 삭제 ****");
          System.out.println("삭제할 userid 입력 : ");
          String deleteId = sc.nextLine();
          System.out.println("기존 password 입력 : ");
          String deletePwd = sc.nextLine();
          MemberDTO rDto = memberDAO.getRow(deleteId, deletePwd);
          if (rDto == null) {
            System.out.println("입력 정보 일치하지 않습니다");
          } else {
            System.out.println(
              memberDAO.delete(deleteId) > 0 ? "삭제 성공" : "삭제 실패"
            );
          }

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
