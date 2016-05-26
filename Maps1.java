import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;


public class Maps1{
	public static  String findMostPopulated(HashMap<String,Integer> that){
		int mostPop = 0;
		String mostPopCity = "";
		if(that.isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		for(String key : that.keySet() ){
			if(that.get(key) >= mostPop){
				mostPop = that.get(key);
				mostPopCity = key;
			}
		}
		return mostPopCity;
		// return name.toString();
	}
	
	  public static  List<String> orderByPopulation( HashMap<String,Integer> that){
		    List<String> city = new ArrayList<String>();

			while(!that.isEmpty() ){
				city.add(findMostPopulated(that));
				that.remove(findMostPopulated(that));
			}
			return city;
		    
		  }
	public static void check(String expected,List<String>city,List<Integer>population){
		HashMap<String,Integer>map=new HashMap<>();
		for(int i=0;i<city.size();i++){ map.put(city.get(i),population.get(i));}
		assert expected.equals(findMostPopulated(map)):"expected "+expected+" but was "+findMostPopulated(map);
	}
	public static void main(String [] arg){
		check("Rome",Arrays.asList("Rome","Milan","Venice"),
				Arrays.asList(500,100,10));
		check("Milan",Arrays.asList("Rome","Milan","Venice"),
				Arrays.asList(100,500,10));
		check("Milan",Arrays.asList("Milan"),
				Arrays.asList(100));
		try{findMostPopulated(new HashMap<String,Integer>());assert false;}catch (java.util.NoSuchElementException e){}
	}
}