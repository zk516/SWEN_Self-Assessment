//class A{
//  void pass(){ assert true;}
//  void test(){ new C().test();}
//  class C{
//    void pass(){ assert false;}
//    void test(){ A.class.getDeclaredClasses()[0].newInstance().pass();}
//  }
//}
//public class NestedSyntax5{
//
//  public static void main(String [] arg){
//    new A().test();
//  }
//}
//   