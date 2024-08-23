package streamAPI;

import java.util.stream.Stream;

public class Takewhile {
	public static void main(String[] args) {
//		short-circuting stateful intermediate (remain of the every object)
      Stream.of(1,2,3,4,5,6,7,8,9,10)
      .takeWhile(tnm ->{
    	  System.out.println("filter : applying filter an the number  "+tnm);
    	  return tnm<6;
      })
      .map(num ->{
    	  System.out.println("map : mapping number 1o number "+num);
    	  return num +num;
      })
      .forEach(inm -> System.out.println(inm));
      
	}
}
