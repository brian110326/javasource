package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Practice {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);

      String sql =
        "SELECT *\r\n" + //
        "FROM BOOKTBL b \r\n";
      pstmt = con.prepareStatement(sql);

      rs = pstmt.executeQuery();

      while (rs.next()) {
        int code = rs.getInt(1);
        String title = rs.getString(2);
        String writer = rs.getString(3);
        int price = rs.getInt(4);
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
