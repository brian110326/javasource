package interfacetest;

public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbwork(obj);

    // System.out.println();

    // obj = new MySql();
    // dbwork(obj);

    dbwork(new Oracle());
    dbwork(new MySql());

    // 익명 클래스 : 일회용 클래스 ==> 클래스 만든것임(인스턴스 생성X)
    DataAccessObject object = new DataAccessObject() {
      @Override
      public void select() {
        System.out.println("SQL 검색");
      }

      @Override
      public void insert() {
        System.out.println("SQL 삽입");
      }

      @Override
      public void udpate() {
        System.out.println("SQL 수정");
      }

      @Override
      public void delete() {
        System.out.println("SQL 삭제");
      }
    };

    dbwork(object);
  }

  public static void dbwork(DataAccessObject obj) {
    obj.select(); //Oracle DB에서 검색 or MySql DB에서 검색
    obj.insert(); //Oracle DB에서 삽입 or MySql DB에서 삽입
    obj.udpate(); //Oracle DB에서 수정 or MySql DB에서 수정
    obj.delete(); //Oracle DB에서 삭제 or MySql DB에서 삭제
  }
}
