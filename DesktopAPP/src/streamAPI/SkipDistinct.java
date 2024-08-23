package streamAPI;

import java.util.stream.Stream;

public class SkipDistinct {
	public static void main(String[] args) {
//		Skip(2) skip two element  and Distinct (intermediate stateful)
      Stream.of("Ramesh","Bishnu","Arati","Sarita","Ramesh","Arati")
//      .skip(2)
      .distinct()
      .forEach(nm->System.out.println(nm));
     
      
	}
}
