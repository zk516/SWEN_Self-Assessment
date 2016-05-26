//import java.util.Arrays;
//import java.util.List;
//abstract class A<T>{
//  T findMax(List<T> that){
//    if(that.isEmpty()){throw new java.util.NoSuchElementException();}
//    T candidate=that.get(0);
//    for(T s:that){
//      candidate=better(candidate,s);
//    }
//    return candidate;
//  }
//  abstract T better(T e1, T e2);
//}
//
//class Student{
//  final String name;
//  final float averageMark;
//  final int height;
//  Student(String name, float averageMark, int height){
//    this.name=name;
//    this.averageMark=averageMark;
//    this.height=height;
//  }
//  public String toString(){
//    return "S("+name+","+averageMark+","+height+")";
//  }
//}
//
//class B extends A<Student>{
//
//	Student better(Student e1, Student e2) {
//		
//		if(e1.height<=e2.height){
//			return e2;
//		}else{
//			return e1;
//		}
//	}
//}
//
//public class TemplateMethod2{
//  static void check(String expected, Student ... data){
//    Student result=new B().findMax(Arrays.asList(data));
//    assert expected.equals(result.name):
//      "on data: "+data+"expected: "+expected+" result: "+result.name;
//  }
//  public static void main(String [] arg){
//    check("Paul",
//      new Student("Paul",10,185),
//      new Student("Lan",8,145),
//      new Student("Marco",9,178));
//    check("Thor",
//      new Student("Paul",10,185),
//      new Student("Thor",10,215),
//      new Student("Marco",9,178));
//    check("Godzilla",
//      new Student("Godzilla",1,6500));
//  }
//}
//   