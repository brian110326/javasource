package book;

import static book.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// ~DAO : 자바와 데이터베이스를 연결하는 객체
// 데이터베이스 담당 클래스

// static{} : 클래스가 메모리에 처음 로딩될 때 한번만 수행

public class BookDAO {

  private Connection con = null;
  private PreparedStatement pstmt = null;
  private ResultSet rs = null;

  // static {
  //   try {
  //     Class.forName("oracle.jdbc.OracleDriver");
  //   } catch (ClassNotFoundException e) {
  //     e.printStackTrace();
  //   }
  // }

  // public Connection getConnection() {
  //   Connection con = null;

  //   String url = "jdbc:oracle:thin:@localhost:1521:xe";
  //   String user = "c##test2";
  //   String password = "test";

  //   try {
  //     con = DriverManager.getConnection(url, user, password);
  //   } catch (SQLException e) {
  //     e.printStackTrace();
  //   }
  //   return con;
  // }

  // public void close(Connection con, PreparedStatement pstmt) {
  //   try {
  //     if (pstmt != null) {
  //       pstmt.close();
  //     }
  //     if (con != null) {
  //       con.close();
  //     }
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  // }

  // public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
  //   try {
  //     if (rs != null) {
  //       rs.close();
  //     }
  //     if (pstmt != null) {
  //       pstmt.close();
  //     }
  //     if (con != null) {
  //       con.close();
  //     }
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  // }

  // C(insert)R(select)U(update)D(delete)
  public int insert(BookDTO dto) {
    // 2. 커넥션 얻기 ==> insert할때 꼭 이 과정을 거쳐야하기 때문
    con = getConnection();
    int result = 0;

    String sql =
      "INSERT INTO BOOKTBL b(code, title, writer, price) VALUES(?,?,?,?)";

    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      pstmt.setInt(1, dto.getCode());
      pstmt.setString(2, dto.getTitle());
      pstmt.setString(3, dto.getWriter());
      pstmt.setInt(4, dto.getPirce());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public BookDTO getRow(int code) {
    // 하나만 조회
    // 인자를 전달하는 과정 중 네트워크 해킹당할 위험
    con = getConnection();
    // String sql =
    //   "SELECT *\r\n" + //
    //   "FROM BOOKTBL b \r\n" + //
    //   "WHERE CODE = " +
    //   code;

    String sql =
      "SELECT *\r\n" + //
      "FROM BOOKTBL b \r\n" + //
      "WHERE CODE = ?";

    BookDTO dto = null;

    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      pstmt.setInt(1, code); //1 ==> 1번(첫번째) 물음표
      rs = pstmt.executeQuery();
      // rs ==> BookDTO에 옮겨 담기
      if (rs.next()) {
        // int code1 = rs.getInt("code");
        // String title = rs.getString("title");
        // String writer = rs.getString("writer");
        // int price = rs.getInt("price");

        // dto.setCode(code1);
        // dto.setTitle(title);
        // dto.setWriter(writer);
        // dto.setPirce(price);

        dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPirce(rs.getInt("price"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    // close(rs)가 있기때문에 교환을 못함 ==> DTO로 복사본

    return dto;
  }

  public List<BookDTO> getRows() {
    // 여러개 조회
    con = getConnection();
    String sql =
      "SELECT *\r\n" + //
      "FROM BOOKTBL b \r\n";

    List<BookDTO> list = new ArrayList<>();

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        // 행 하나 ==> BookDTO로 생성(행 하나하나가 BookDTO임)
        BookDTO dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPirce(rs.getInt("price"));

        // BookDTO를 리스트에 추가
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(BookDTO dto) {
    con = getConnection();
    int result = 0;

    String sql = "UPDATE BOOKTBL SET PRICE  = ? WHERE CODE = ?";

    try {
      pstmt = con.prepareStatement(sql);

      pstmt.setInt(1, dto.getPirce());
      pstmt.setInt(2, dto.getCode());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public int delete(int code) {
    con = getConnection();
    int result = 0;

    String sql = "DELETE FROM BOOKTBL WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }
}
