package generics;

import java.util.ArrayList;

public class Box3<T> {

  ArrayList<T> list = new ArrayList<>();

  public void add(T item) {
    list.add(item);
  }

  public T get(int i) {
    return list.get(i);
  }

  public ArrayList<T> getList() {
    return list;
  }

  public int size() {
    return list.size();
  }

  @Override
  public String toString() {
    return list.toString();
  }
}
