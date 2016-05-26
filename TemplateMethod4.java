////The answer must have balanced parentesis
////Extend class A<T> so that findMax finds 
////the student with the highest mark
//import java.util.Arrays;
//import java.util.List;
//abstract class A<T>{
//	T findMax(List<T> that){
//		if(that.isEmpty()){throw new java.util.NoSuchElementException();}
//		T candidate=that.get(0);
//		for(T s:that){
//			candidate=better(candidate,s);
//		}
//		return candidate;
//	}
//	abstract T better(T e1, T e2);
//}
//
//class Student{
//	final String name; final float averageMark; final int height;
//	Student(String name, float averageMark, int height){
//		this.name=name;this.averageMark=averageMark; this.height=height;
//	}
//	public String toString(){
//		return "S("+name+","+averageMark+","+height+")";
//	}
//}
//class B extends A<Student>{
//
//	Student better(Student e1, Student e2) {
//		if(e1.averageMark>=e2.averageMark){
//			return e1;
//		}else {
//			return e2;
//		}
//	}
//
//}
//
//		public class TemplateMethod4{
//	static Student S(String name, float averageMark, int height){
//		return new Student(name,averageMark,height);}
//	static void check(String expected,List<Student> data){
//		Student result=new B().findMax(data);
//		assert expected.equals(result.name): "on data: "+data+"expected: "+expected+" result: "+result.name;
//	}
//	public static void main(String [] arg){
//		check("Adam", Arrays.asList(S("Adam",10,185),S("Zorro",8,145)));
//		check("Paul", Arrays.asList(S("Paul",10,185),S("Lan",8,145),S("Marco",9,178)));
//		check("Paul", Arrays.asList(S("Paul",10,185),S("Thor",1,215),S("Marco",9,178)));
//		check("Godzilla", Arrays.asList(S("Godzilla",1,6500)));
//	}
//}