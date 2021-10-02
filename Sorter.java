import java.util.ArrayList;
import java.util.Collections;

public  class Sorter{

	public static void animalSort(ArrayList<Animal> a){

		Collections.sort(a, (a1, a2) -> a1.compare(a1, a2));
		
	}
}