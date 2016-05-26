class A{
  class C{
    int foo(){return 42;}
  }
}
public class NestedSyntax4{

  public static void main(String [] arg) throws InstantiationException, IllegalAccessException{
	  System.out.println(A.C.class.newInstance());
    assert ( new A(){
    	public int foo(){return 42;} 
    }.foo()==42);
  }
}