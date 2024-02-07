package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 인스턴스 생성(객체)
    Student student = new Student();

    student.id = "20182050";
    student.name = "Brian";
    student.addr = "Seoul";
    student.hp = "010-2367-8728";

    print(student);

    // 자동으로 생성자 호출
    Student student2 = new Student();
    student2.id = "20182044";
    student2.name = "efe";
    student2.addr = "Seoul";
    student2.hp = "010-3333-4444";

    print(student2);
  }

  public static void print(Student s) {
    System.out.println(s.name);
    System.out.println(s.addr);
    System.out.println(s.id);
    System.out.println(s.hp);
  }
}
