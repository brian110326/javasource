package book;

import static book.JdbcUtil.close;
import static book.JdbcUtil.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PracticeDAO {

  private Connection con = null;
  private PreparedStatement pstmt = null;
  private ResultSet rs = null;

  public int insert(PracticeDTO dto) {
    con = getConnection();
    int result = 0;
    String sql =
      "INSERT INTO BOOKTBL b(code, title, writer, price) VALUES(?,?,?,?)";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getCode());
      pstmt.setString(2, dto.getTitle());
      pstmt.setString(3, dto.getWriter());
      pstmt.setInt(4, dto.getPrice());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }

  public PracticeDTO getRow(int code) {
    con = getConnection();

    String sql =
      "SELECT *\r\n" + //
      "FROM BOOKTBL b \r\n" + //
      "WHERE CODE = ?";
    PracticeDTO dto = null;

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      rs = pstmt.executeQuery();

      if (rs.next()) {
        dto = new PracticeDTO();

        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return dto;
  }

  public List<PracticeDTO> getRows() {
    con = getConnection();
    String sql =
      "SELECT *\r\n" + //
      "FROM BOOKTBL b \r\n";

    List<PracticeDTO> list = new ArrayList<>();

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        PracticeDTO dto = new PracticeDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }

  public int update(PracticeDTO dto) {
    con = getConnection();
    int result = 0;
    String sql = "UPDATE BOOKTBL SET PRICE  = ? WHERE CODE = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getPrice());
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
