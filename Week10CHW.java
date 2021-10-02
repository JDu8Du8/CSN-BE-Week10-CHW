import java.util.ArrayList;
import java.util.Collections;

public class Week10CHW {

	public static void main(String[] args) {

// Create Database
// Animals to be compared based on their weight (3rd variable).
		ArrayList<Animal> Zoo = new ArrayList<Animal>();
		Zoo.add(new Animal("Malamute", "Alaska", 3));
		Zoo.add(new Animal("Elephant", "Indonesia", 4));
		Zoo.add(new Animal("Capuchin Monkey", "South Borneo", 1));
		Zoo.add(new Animal("Serval", "Africa", 2));

// Lambda Expression Sort
		System.out.println("Sort by Lambda");
		System.out.println("Unsorted");
		for(Animal z : Zoo) 
			System.out.println(z.toString());
		
		Sorter.animalSort(Zoo);
		
		System.out.println("\nSorted");
		for(Animal z : Zoo) 
			System.out.println(z.toString());

		Collections.shuffle(Zoo);
		
//Method Reference Sort
		System.out.println("\n\nSort by Method Reference");
		System.out.println("Unsorted");
		for(Animal z : Zoo)
			System.out.println(z.toString());
		
		Collections.sort(Zoo, Animal::compare);
		
		System.out.println("\nSorted");
		for(Animal z : Zoo)
			System.out.println(z.toString());
	}

}
