import java.util.ArrayList;
import java.util.stream.Collectors;


public class Week10CHW_2 {

	public static void main(String[] args) {

// Create Array
		ArrayList<Animal> Zoo = new ArrayList<Animal>();
		Zoo.add(new Animal("Malamute", "Alaska", 3));
		Zoo.add(new Animal("Elephant", "Indonesia", 4));
		Zoo.add(new Animal("Capuchin Monkey", "South Borneo", 1));
		Zoo.add(new Animal("Serval", "Africa", 2));

// Display Array without Sort
		System.out.println("Unsorted Array");
		for(Animal z : Zoo)
			System.out.println(z.toString());

// Convert Array to String with natural, alphabetical sorting
		String collect = Zoo.stream().map(Animal::toString).sorted().collect(Collectors.joining(", "));	
		System.out.println("\nSorted Stream");
		System.out.println(collect);
	}
}
