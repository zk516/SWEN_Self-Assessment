////The answer must be the shortest possible
//class EmptyArrayException extends RuntimeException{}
//class ArrayUtil{
//  public static Object lastElement (Object[]array) throws java.lang.ArrayIndexOutOfBoundsException{
//    if(array.length>0)return array[array.length-1];
//    throw new EmptyArrayException();
//  }
//}
//public class ExceptionsD3{
//  public static void test(){
//    assert ArrayUtil.lastElement(new Integer[]{1,2,3}).equals(3);
//    assert ArrayUtil.lastElement(new Integer[]{1,2}).equals(2);
//    assert ArrayUtil.lastElement(new Integer[]{1}).equals(1);
//    assert ArrayUtil.lastElement(new Integer[]{}).equals(1);
//    assert false:"Code not reachable";
//  }
//  public static void main(String [] arg){
//    try{ test();}
//    catch(Throwable t){/*the test suit
//      logs t on the test results: 
//      a single place for error logging.*/}
//  }
//}