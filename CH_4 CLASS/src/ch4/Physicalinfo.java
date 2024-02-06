package ch4;

public class Physicalinfo {

  // name, age, weight, height
  private String name;
  private int age;
  private double weight;
  private double height;

  public Physicalinfo(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      return;
    }
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    if (weight < 0.0d) {
      return;
    }
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height < 0.0d) {
      return;
    }
    this.height = height;
  }

  // 메소드 오버로딩
  public void update(int age) {
    this.age = age;
  }

  public void update(int age, double height) {
    update(age);
    this.height = height;
  }

  public void update(int age, double height, double weight) {
    // this.age = age;
    // this.height = height;
    update(age, height);
    this.weight = weight;
  }
}
