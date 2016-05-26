public class ExceptionsGoodToKnow{
  public static int a()throws Throwable{
    return 1;
  }
  public static int b(){
    try{ return b();}
    catch(Throwable t){
    	throw new Error(t);
    	}
    finally{
    	return 0;
    }
  }
  public static void main(String [] arg){
    assert b()==0;
  }
}