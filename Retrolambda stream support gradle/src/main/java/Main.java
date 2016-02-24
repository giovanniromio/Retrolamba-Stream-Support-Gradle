import java.util.List;
import java.util.Set;

import java8.util.stream.*;

public class Main {

	public static void main(String [] args){
		/*use java8 to compile; source code runs in java7*/
		Set<? extends Object> mySet = LongStreams
				.iterate(1,x->x+1)
				.limit(10000)
				.filter(n -> n % 2 != 0)	
				.mapToObj(Long::valueOf)								
				.collect(Collectors.toSet())
				;
		System.out.println(mySet);
		
	}
	
}
/*import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
		use java8 to compile; source code runs in java7
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		System.out.println(mySet);
		sommaRicorsiva(mySet);
		System.out.println(mySet);
		
	}
    
    private static void sommaRicorsiva(final Set<Integer> mySet){
    	for(Integer i: mySet){
    		i ++ ;
    		if(i < 2){
    			sommaRicorsiva(mySet);
    		}
    			
    	}
    }
    
    
}
*/