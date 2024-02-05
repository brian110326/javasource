package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 인스턴스 생성(객체)
    Student student = new Student();
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.id);
    System.out.println(student.hp);

    student.id = "20182050";
    student.name = "Brian";
    student.addr = "Seoul";
    student.hp = "010-2367-8728";

    // 자동으로 생성자 호출
    Student student2 = new Student();
    student2.id = "20182044";
    student2.name = "efe";
    student2.addr = "Seoul";
    student2.hp = "010-3333-4444";

    System.out.println(student2.name);
    System.out.println(student2.addr);
    System.out.println(student2.id);
    System.out.println(student2.hp);
  }
}
