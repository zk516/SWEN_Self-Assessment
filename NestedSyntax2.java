//class A{
//	static class B{
//		static class C{ 
//			B b;
//			C(B b){
//				this.b=b;
//			}
//			int foo(){
//				return 42;
//			}
//		}
//	}
//}
//public class NestedSyntax2{
//
//	public static void main(String [] arg){
//		assert (new A.B.C(new A.B()).foo()==42);
//	}
//}
