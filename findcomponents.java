import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;


public class findcomponents {
	private static ArrayList<ArrayList<Integer>> list;
	private static ArrayList<ArrayList<Integer>> revList; 
	private static ArrayList<Integer> black;
	private static int[] dfsResult;

	public static void main(String[] args) throws IOException{
		String fnBase = "";//(matrix2list.class.getProtectionDomain().getCodeSource().getLocation()+"").substring(5); //may need to edit
		String filename = fnBase+"matrix.txt";

		getAdjList(filename);
		getRevList();

		dfsResult = dfs(list);
		filename = fnBase+"components.txt";
		dfsRev(revList,filename);
	}

	private static void getAdjList(String filename) throws FileNotFoundException{
		Scanner scan = new Scanner(new File(filename));
		list = new ArrayList<ArrayList<Integer>>();

		while(scan.hasNext()){
			String current = scan.nextLine();
			String[] line = current.split(",");
			ArrayList<Integer> entry = new ArrayList<Integer>();

			for(int i = 0; i < line.length; i++){
				if(Integer.parseInt(line[i])==1){
					entry.add(i);
				}
			}
			list.add(entry);
		}
		scan.close();		
	}

	private static void getRevList(){
		revList = new ArrayList<ArrayList<Integer>>();
		TreeMap<Integer,ArrayList<Integer>> rlist = new TreeMap<Integer,ArrayList<Integer>>();


		for(int i = 0; i < list.size(); i++){
			ArrayList<Integer> current = list.get(i);

			for(int j = 0; j < current.size(); j++){
				int from = current.get(j);
				int to = i;
				if(!rlist.containsKey(from)){
					rlist.put(from, new ArrayList<Integer>());
				}
				rlist.get(from).add(to);
			}

		}
		for(int i = 0; i <rlist.size(); i++){
			//if(rlist.containsKey(i))
			revList.add(rlist.get(i));
		}
	}

	private static void dfsRev(ArrayList<ArrayList<Integer>> list, String filename) throws IOException{
		BufferedWriter bw = new BufferedWriter(new PrintWriter(new File(filename)));
		String out = "";


		black = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		ArrayList<Integer> conComp = new ArrayList<Integer>();

		stack.push(0);
		while(black.size()!=list.size()){

			while(!stack.isEmpty()){
				if(nextWhiteNeighbours(list, stack.peek(),stack)==-1){
					Integer done = stack.pop();
					//System.out.print(String.format("%d,%d\n",count,done));
					conComp.add(done);
					black.add(done);
					count++;				
				} else {
					int whiteN = nextWhiteNeighbours(list, stack.peek(),stack);
					//debugSystem.out.printf("\nPushing whiteN = %d\n",whiteN);
					stack.push(whiteN);
				}
			}

			Collections.sort(conComp);
			for(int j = 0; j < conComp.size(); j++){
				if(j!=conComp.size()-1){
					//System.out.printf("%d,",conComp.get(j));
					out = String.format("%d,",conComp.get(j));
					bw.write(out);
				} else {
					//System.out.printf("%d\n",conComp.get(j));
					out = String.format("%d\n",conComp.get(j));
					bw.write(out);
				}
			}
			bw.flush();
			conComp = new ArrayList<Integer>();
			stack.push(getNextNode());
		}
		bw.close();
	}
	private static int[] dfs(ArrayList<ArrayList<Integer>> list){
		int[] result = new int[list.size()];
		black = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		stack.push(0);
		while(!stack.isEmpty()){
			if(nextWhiteNeighbours(list, stack.peek(),stack)==-1){
				Integer done = stack.pop();
				//System.out.print(String.format("%d,%d\n",count,done));
				result[count] = done;
				black.add(done);
				count++;				
			} else {
				int whiteN = nextWhiteNeighbours(list, stack.peek(),stack);
				//debugSystem.out.printf("\nPushing whiteN = %d\n",whiteN);
				stack.push(whiteN);
			}
		}

		return result;
	}
	private static Integer nextWhiteNeighbours(ArrayList<ArrayList<Integer>> list, Integer v, Stack<Integer> s){
		ArrayList<Integer> current = list.get(v);
		//debugSystem.out.println(current);
		for(Integer i : current){
			if(!s.contains(i) && !black.contains(i)){
				return i;
			}
		}
		return -1;
	}
	//returns start of next connected component
	private static Integer getNextNode(){
		int result = -1;
		for(int i = dfsResult.length-1; i>=0; i--){
			if(!black.contains(dfsResult[i])){
				result = dfsResult[i];
				break;
			}			
		}

		return result;
	}





	/*	for(int i = 0; i < j.size(); i++){
			ArrayList<Integer> current = j.get(i);
			Collections.sort(current);
			for(int j = 0; j < current.size(); j++){
				if(j!=current.size()-1){
					System.out.printf("%d,",current.get(j));
				} else {
					System.out.printf("%d\n",current.get(j));
				}
			}
		}
	 */
}
