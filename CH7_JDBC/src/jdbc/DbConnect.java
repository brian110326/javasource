package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// JDBC(Java DataBase Connection)
// java에서 데이터베이스 접속할 수 있도록 제공되는 api

// java와 DB 사이 연결을 담당하는 드라이버가 필요 ==> DB에 따라 다른 드라이버가 필요
// C:\Users\soldesk\AppData\Roaming\DBeaverData\drivers\maven\maven-central\com.oracle.database.jdbc
// ojdbc11.jar(jar : 클래스가 압축된것)

// java.sql.Connection

public class DbConnect {

  public static void main(String[] args) {
    // DB 서버 연결
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      // Oracle 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // jdbc:oracle:thin:@ 까지는 고정
      // jdbc:oracle:thin:@//[hostname]:[port]/[DB service name]
      // localhost  ==> 내 컴퓨터
      // 하지만 DB 서버가 다른 곳에 있다면 DB 서버 ip 주소 기입
      // 오라클 설치 시 기본포트 번호 : 1521
      // DB service name ==> 오라클 Express Edition 버전 서비스 이름 : xe
      // 다른 버전 설치시 orcl
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";

      // 실제 Connection 객체 가져오기
      con = DriverManager.getConnection(url, user, password);

      System.out.println("연결되었습니다");
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
