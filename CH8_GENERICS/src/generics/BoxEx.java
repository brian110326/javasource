package generics;

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();

    box.setItem(new String("홍길동"));
    String str = (String) box.getItem();

    box.setItem(Integer.valueOf(10));
    Integer i = (Integer) box.getItem();

    box.setItem(Float.valueOf(3.44f));
    Float f = (Float) box.getItem();

    Box2<String> box2 = new Box2<>();
    box2.setItem("AAA");
    String str2 = box2.getItem();

    Box2<Integer> box3 = new Box2<>();
    box3.setItem(55);
    Integer i2 = box3.getItem();

    Box2<Float> box4 = new Box2<>();
    box4.setItem(4.56f);

    Box2<Double> box5 = new Box2<>();
    box5.setItem(5.66d);

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    // 부모 타입으로 설정 시 자식 객체 담는것 허용
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    //fruitBox.add(new Toy());

    appleBox.add(new Apple());
    grapeBox.add(new Grape());
    toyBox.add(new Toy());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();
    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());

    System.out.println(Juicer.makeJuice(fruitBox2));
  }
}
