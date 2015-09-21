import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class CollectionsTest {

	
	public static void main(String[] args) {
		
		//Creating variable set is a Type Set with HashSet Object
		Set<String> set = new HashSet<>();
		
		//Adding variables to the Interface Set named set
		set.add(new String("Hello World"));
		set.add(new String("Foobar!"));
		
		//Needs to be after the data is added to the Set
		Iterator<String> it = set.iterator();
		
		//How to print out the set with a iterator
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		//System.out.println(set.toString());
		//System.out.println(set.toString());
		
		
		
	}
	
	
	
}
