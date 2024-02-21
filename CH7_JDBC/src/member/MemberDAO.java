package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.driver.parser.util.Array;

// 메소드 작성
// 실행할 sql 구문 작성
// insert, update, delete ==> executeUpdate() ==> return int
// select
// 결과값이 1개 : executeQuery() ==> return ~DTO
// 결과값이 여러개 ==> return List<~DTO>

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public int insert(MemberDTO dto) {
    con = getConnection();
    int result = 0;
    String sql = "INSERT INTO MEMBERTBL(USERID, PASSWORD, NAME, EMAIL) ";
    sql += "VALUES(?,?,?,?)";

    try {
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public MemberDTO getRow(String userId, String password) {
    con = getConnection();
    MemberDTO memberDTO = null;

    // 개별 회원 조회
    String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  //   public MemberDTO getRow(MemberDTO dto) {
  //     con = getConnection();
  //     MemberDTO memberDTO = null;

  //     // 개별 회원 조회
  //     String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

  //     try {
  //       pstmt = con.prepareStatement(sql);
  //       pstmt.setString(1, dto.getUserId());
  //       pstmt.setString(2, dto.getPassword());
  //       rs = pstmt.executeQuery();
  //       if (rs.next()) {
  //         memberDTO = new MemberDTO();
  //         memberDTO.setUserId(rs.getString("userid"));
  //         memberDTO.setPassword(rs.getString("password"));
  //         memberDTO.setName(rs.getString("name"));
  //         memberDTO.setEmail(rs.getString("email"));
  //       }
  //     } catch (SQLException e) {
  //       e.printStackTrace();
  //     } finally {
  //       close(con, pstmt, rs);
  //     }
  //     return memberDTO;
  //   }

  public List<MemberDTO> getRows() {
    // 전체 회원조회
    con = getConnection();

    String sql = "SELECT * ";
    sql += "FROM MEMBERTBL";

    List<MemberDTO> list = new ArrayList<>();

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        MemberDTO dto = new MemberDTO();
        dto.setUserId(rs.getString("USERID"));
        dto.setPassword(rs.getString("PASSWORD"));
        dto.setName(rs.getString("NAME"));
        dto.setEmail(rs.getString("EMAIL"));

        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }

    return list;
  }

  public int update(String userId, String password) {
    con = getConnection();
    int result = 0;
    String sql =
      "UPDATE MEMBERTBL\r\n" + //
      "SET PASSWORD = ? WHERE USERID = ?";

    try {
      pstmt = con.prepareStatement(sql);
      // ?처리
      pstmt.setString(1, password);
      pstmt.setString(2, userId);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public int delete(String userid) {
    con = getConnection();
    int result = 0;
    String sql = "DELETE FROM MEMBERTBL WHERE USERID = ?";

    try {
      pstmt = con.prepareStatement(sql);
      // ?처리
      pstmt.setString(1, userid);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
