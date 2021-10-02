import java.util.*;
public class Week10CHW_3 {

// Optional with Custom Message for Animal Not Found &&
// Lambda Expression with Custom Error Message for NoSuchElementException
	static Animal methodA(Optional<Animal> a){
		return Optional
				.ofNullable(a)
				.orElseThrow( () -> new NoSuchElementException("Animal Not Found!"))
				.get();						
	}

//Method B to Call Method A with filled/empty sets.
	static void methodB(Optional<Animal> a){
		try {
			System.out.println("Method B with Data");
			System.out.println(methodA(a));
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Method B with Empty");
			System.out.println(methodA(null));
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		Optional<Animal> a = Optional.of(new Animal("Dog", "Everywhere", 999));		
		methodB(a);	
	}

}
