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
//class B extends A<Integer>{
//	Integer better(Integer e1, Integer e2){
//		return Math.min(e1, e2);
//
//	}
//}
//
//public class TemplateMethod1{
//	static void check(Integer expected,List<Integer> data){
//		Integer result=new B().findMax(data);
//		assert expected.equals(result): "on data: "+data+"expected: "+expected+" result: "+result;
//	}
//	public static void main(String [] arg){
//		check(3,Arrays.asList(22,12,13,14,55,102,13,3));
//		check(-12,Arrays.asList(22,-12,13,14,55,102,13,3));
//		check(1,Arrays.asList(1));
//	}
//}
