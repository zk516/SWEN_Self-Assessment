import java.util.*;
class Point{ int x;int y;
  Point(int x, int y){this.x=x;this.y=y;}
  public String toString(){return "["+x+","+y+"]";}
}
public class Collectionssort{


public static void main(String [] arg){
    ArrayList<Point> ps=new ArrayList<Point>();
    ps.add(new Point(2,2));
    ps.add(new Point(1,2));
    ps.add(new Point(3,2));
    ps.add(new Point(2,5));
//    Collections.sort(ps,new Comparator<Point>(){
//
//
//
//		@Override
//		public int compare(Point o1, Point o2) {
//			
//			if(o1.x<o2.x){
//				return -1;
//			}else if(o1.x==o2.x){
//				if(o1.y<o2.y){
//					return -1;
//				}else if(o1.y==o2.y){
//					return 0;
//				}
//			}else{
//				return 1;
//			}
//			return 0;
//		}
//
//
//
//
//
//		
//    	
//    });
    
    System.out.println(ps.toString());
    assert(ps.toString().equals("[[1,2], [2,2], [2,5], [3,2]]")):ps.toString();
  }
}