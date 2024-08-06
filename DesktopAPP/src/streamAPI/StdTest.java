package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StdTest {
	public static void main(String[] args) {
		Student std1 = new Student(1, "Ramesh", 23);
		Student std2 = new Student(1, "Ram", 23);
		Student std3 = new Student(1, "sita", 24);
		Student std4 = new Student(1, "shiva", 25);
		Student std5 = new Student(1, "sajita", 26);
		Student std6 = new Student(1, "ajita", 27);

//		Stream is a pipeline it is not a data structure
//		data source where the data exist
//		List<Student> studentlist = Arrays.asList(std1, std2, std3,std4,std5,std6);
//		data pipe
//		Stream<Student> streamlist = studentlist.stream();
//		streamlist.forEach(std -> System.out.println(std));
		
//		stdlist.stream().forEach(std -> System.out.println(std));
		
//		lambda in single line code 
//		studentlist.stream().filter(ag -> ag.getAge() > 25).forEach(std -> System.out.println(std.getAge()+" "+std.getName()));
		
		
//		lambda in breakdown 
		Stream<Student> stdStreamlist = Arrays.asList(std1, std2, std3, std4, std5, std6).stream();

		Stream<Student> stdStreamlistFilter = stdStreamlist.filter(ag -> ag.getAge() >= 25);

		Stream<String> stdStreamlistFilterMap = stdStreamlistFilter.map(std -> {
		   return std.getName()+" " +std.getAge() ;
		});
		stdStreamlistFilterMap.limit(4)	
		.forEach(result -> {
		    System.out.println("Result: " + result);
		});

		
	}
	
	
}
