//
//
//class A{
//	private static class B{}
//	static class C{ 
//		B b;
//		C(B b){
//			this.b=b;
//		}
//		  int foo(){
//			return 42;
//		}
//	}
//}
//public class NestedSyntax3{
//	public static void main(String [] arg){
//		
//		assert (  new A.C(null).foo()==42);
//	}
//}