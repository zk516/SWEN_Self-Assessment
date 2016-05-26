import java.util.*;
public class Generic5 {

  static < T extends String> String get(List<T> strings, int element) {
    return strings.get(element);
  }

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello");
    strings.add("Dave");
    assert get(strings,0).equals("Hello");
    assert get(strings,1).equals("Dave");
  }
}