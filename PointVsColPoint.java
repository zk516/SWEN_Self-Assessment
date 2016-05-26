//class Point{ int x;int y;
//  Point(int x, int y){this.x=x;this.y=y;}
//}
//class ColPoint extends Point{ int colour;
//  ColPoint(int x, int y,int colour){
//    super(x,y);this.colour=colour;}
//}
//public class PointVsColPoint{
//  public static void main(String [] arg){
//    ColPoint c1 = new ColPoint(1,2,124);
//    ColPoint c2 = new ColPoint(1,3,120);
//    Point c3 = new Point(1,5);
//    assert(c1 == min(c1,c3));
//    c2 = min(c1,c2);
//    assert(c1 == c2);
//  }
//public static ColPoint min(ColPoint c1,Point c2){
//	return c1;
//}
//}
//   