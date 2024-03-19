package util;

import java.util.Objects;

public class Member {

  private String id;
  private String name;

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

  @Override
  public String toString() {
    return "Member [id = " + id + ", name = " + name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member m = (Member) obj;
      if (this.id.equals(m.id) && this.name.equals(m.name)) {
        return true;
      }
    }
    return false;
  }

  // @Override
  // public int hashCode() {
  //   int hash = Objects.hash(id, name);
  //   return hash;
  // }
  @Override
  public int hashCode() {
    int hash = Objects.hash(id, name);
    return hash;
  }
}
