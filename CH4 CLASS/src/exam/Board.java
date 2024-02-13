package exam;

import java.time.LocalDateTime;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성일, 수정날짜
  private int boardNum;
  private String title;
  private String content;
  private String name;
  private LocalDateTime regDate;
  private LocalDateTime lastModifiedDate;

  public Board() {}

  public Board(int boardNum, String title, String content, String name) {
    this.boardNum = boardNum;
    this.title = title;
    this.content = content;
    this.name = name;
  }
}
