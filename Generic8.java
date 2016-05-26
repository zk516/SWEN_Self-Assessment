import java.util.*;

class Parent {
  public List<? super  Child> get() {
    ArrayList<Parent> r = new ArrayList<Parent>();
    r.add(this);
    return r;
  }
  public String toString() { return "Parent"; }
}

class Child extends Parent {
  public List<? super  Parent> get() {
    ArrayList<Object> r = new ArrayList<Object>();
    r.add(this);
    return r;
  }
  public String toString() { return "Child"; }
}

public class Generic8 {

  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();
    assert parent.get().toString().equals("[Parent]");
    assert child.get().toString().equals("[Child]");
  }
}
   