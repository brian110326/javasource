package inheritance;

public class ChildEx {

  public static void main(String[] args) {
    Parent parent = new Parent(15);
    Child child = new Child(10);
    Child2 child2 = new Child2(11);
    GrandChild grandChild = new GrandChild(5);

    System.out.println(parent.getAge());
    System.out.println(child.getAge());
    System.out.println(child2.getAge());
    System.out.println(grandChild.getAge());

    child.play();
    grandChild.play();

    // 오버라이딩 메소드 호출
    parent.print(); //나이는 15입니다
    child.print(); // My name is Brian

    child2.print(); //나이는 15입니다
    grandChild.print(); // My name is Brian
  }
}
