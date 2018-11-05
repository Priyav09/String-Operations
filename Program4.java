import java.util.*;
//Program 4
public class Program4 {
	
	//Method to sort the string after spliting
	private void sortString(String s) {
		Set<String> sortSet = new TreeSet<String>();		
		String[] words = s.split("\\s");
		for(String str : words) {
			sortSet.add(str);
		}
		
		System.out.println("Elements in dictionary order :");
		Iterator it = sortSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 sortSplitString = new Program4();
		sortSplitString.sortString("this is the world of a little digger");
	}

}
