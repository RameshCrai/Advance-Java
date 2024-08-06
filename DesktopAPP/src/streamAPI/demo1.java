package streamAPI;


import java.util.stream.Stream;

public class demo1 {
	public static void main(String[] args) {
//		1
//		 Consumer<Integer> consumer = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t+" ");				
//			}
//		};
			 
//		2
//		 stream.of => (source of data)   and destination is => forEach(consumer)
//         Stream<Integer> intigerStream =  Stream.of(1,2,3,4,5,6,7,8);
//         intigerStream.forEach(new Consumer<Integer>() {
// 			
// 			@Override
// 			public void accept(Integer t) {
// 				System.out.print(t+" ");				
// 			}
// 		});
          
//         3 using lambda
         Stream.of(1,2,3,4,5,6,7,8)
         .forEach((t) -> {System.out.print(t+" ");});
	}
}
