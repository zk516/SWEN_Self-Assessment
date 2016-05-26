import java.util.*;
public class ApplicableMethod{
  public static void main(String [] arg){
    List<String> sl = new ArrayList<String>();
    List<Integer> il = new ArrayList<Integer>();
    sl.add("foo");sl.add("bar");
    il.add(1);il.add(2);
    assert myToString(sl).equals("foobar");
    assert myToString(il).equals("12");
  }
  static String myToString( List<? extends Object> sl) {
	  StringBuilder sb = new StringBuilder();

	  for(Object a:sl){
		  sb.append(a);
		  
	  }
	  return sb.toString();
  }
}