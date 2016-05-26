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
//abstract T better(T e1, T e2);
//}
//
//class Person {
//	String name,address;
//	public Person(String name, String address) {
//		this.name = name;
//		this.address = address;
//	}
//
//}
//
// class B extends A<Person>{
//
//
//
//	@Override
//	Person better(Person e1, Person e2) {
//		if(e1.address.length()<=e2.address.length()){
//			return e1;
//		}else{
//			return e2;
//		}
//		
//	}
//
//}
//
//
//
//public class TemplateMethod5{
//  static Person P(String name, String address){
//    return new Person(name,address);}
//  static void check(String expected,List<Person> data){
//    Person result=new B().findMax(data);
//    assert expected.equals(result.name): "on data: "+data+"expected: "+expected+" result: "+result.name;
//  }
//  public static void main(String [] arg){
//    check("Zorro", Arrays.asList(P("Adam","saint monique road 234"),P("Zorro","secret cave")));
//    check("Lan", Arrays.asList(P("Paul","google road 245 california"),P("Lan","privateRoad"),P("Marco","Via Cesare Cabella Genoa Italy")));
//    check("Godzilla", Arrays.asList(P("Godzilla","under the sea")));
//  }
//}