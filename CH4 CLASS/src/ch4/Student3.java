package ch4;

public class Student3 {

  private String id;
  private String name;
  private int kor;
  private int eng;
  private int mat;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMat() {
    return mat;
  }

  public void setMat(int mat) {
    this.mat = mat;
  }

  @Override
  public String toString() {
    return (
      "Student3 [id=" +
      id +
      ", name=" +
      name +
      ", kor=" +
      kor +
      ", eng=" +
      eng +
      ", mat=" +
      mat +
      "]"
    );
  }
}
