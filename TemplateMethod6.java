//
//
////The answer must have balanced parentesis
////Extend class A<T> so that findMax finds 
////the student whose mark is the nearest to
////a given target
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
//		this.name=name;this.averageMark=averageMark; this.height=height;}
//	public String toString(){return "S("+name+","+averageMark+","+height+")";}
//}
//class B extends A<Student>{
//	int target;
//
//	public B(int target) {
//		this.target = target;
//	}
//
//	@Override
//	Student better(Student e1, Student e2) {
//		if(e1.averageMark-target<=e2.averageMark-target){
//			return e1;
//		}else{
//			return e2;
//		}
//		
//	}
//
//}
//
//public class TemplateMethod6{
//	static Student S(String name, float averageMark, int height){
//		return new Student(name,averageMark,height);}
//	static void check(int target,String expected,List<Student> data){
//		Student result=new B(target).findMax(data);
//		assert expected.equals(result.name): "on data: "+data+"expected: "+expected+" result: "+result.name;
//	}
//	public static void main(String [] arg){
//		check(5,"Zorro", Arrays.asList(S("Adam",10,185),S("Zorro",8,145)));
//		check(3,"Lan", Arrays.asList(S("Paul",10,185),S("Lan",2,145),S("Marco",5,178)));
//		check(7,"Thor", Arrays.asList(S("Paul",10,185),S("Thor",7,215),S("Marco",9,178)));
//		check(2,"Godzilla", Arrays.asList(S("Godzilla",1,6500)));
//	}
//}
