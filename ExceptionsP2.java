//import java.util.HashMap;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;
//class Person {
//	String name;
//	int age;
//	public Person(String name, int age){
//		if(age<0||name.equals("")){
//			throw new IllegalArgumentException();
//		}
//		this.name = name;
//		this.age = age;
//
//	}
//	public String toString(){
//		return name+":"+age;
//
//	} 
//
//
//}
//public class ExceptionsP2{
//	public static void main(String [] arg){
//
//		assert "Marco:33".equals(new Person("Marco",33).toString());
//		assert "Adam:13".equals(new Person("Adam",13).toString());
//		assert "Godzilla:450000000".equals(new Person("Godzilla",450000000).toString());
//		assert "Lidia:83".equals(new Person("Lidia",83).toString());
//		//System.out.println(new Person("Lidia",-1)+"\n");
//		try{new Person("Lidia",-1);assert false;}catch(IllegalArgumentException e){}
//		try{new Person("Adam",-100);assert false;}catch(IllegalArgumentException e){}
//		try{new Person("",100);assert false;}catch(IllegalArgumentException e){}
//		try{new Person("",10);assert false;}catch(IllegalArgumentException e){}
//		try{new Person("",-100);assert false;}catch(IllegalArgumentException e){}
//	}
//}
//
//
