
public class PuzzlersPlusFour {

	  public static int foo=1;

	  public static void main(String [] arg){
	    int foo=10;
	    System.out.println(foo+4);
	    assert (14==(foo+=4)):"assertion14";
	    assert (18==(foo+=4)):"assertion18";
	    assert (22==(foo+=4)):"assertion22";
	    assert (26==(foo+=4)):"assertion26";
	  }
	}
	   