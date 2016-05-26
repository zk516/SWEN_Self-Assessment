//class Cat {
//  public boolean isEatenBy(Object o) {
//    return false;
//  }
//  public boolean isEatenBy(Dog o) {
//	  if(o.isLittle()){
//		  return false;
//	  }
//	  return true;
//  }
//}
//
//class Dog {
//  private boolean isLittle; // is a little dog?
//
//  public Dog(boolean isLittle) {
//    this.isLittle = isLittle;
//  }
//
//  public boolean isLittle() { return isLittle; }
//
//  public boolean eats(Cat c) {
//    return c.isEatenBy(this);
//  }
//}
//public class poly6 {
//  public static void main(String[] args) {
//    Cat cat = new Cat();
//    Dog lilDog = new Dog(true);
//    Dog bigDog = new Dog(false);
//
//    System.out.println( !lilDog.eats(cat));
//    System.out.println( bigDog.eats(cat));
//  }
//}