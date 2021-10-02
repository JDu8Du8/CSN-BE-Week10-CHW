
public class Animal {
	String name = "";
	String origin = "";
	int weight = 0;
	
	public Animal(String newName, String newOrigin, int newWeight) {
		this.name = newName;
		this.origin = newOrigin;
		this.weight = newWeight;
	}

	public String toString() {
		return (origin + " " + name);
	}
	
	public static int compare(Animal a, Animal b) {
		if (a.weight > b.weight) {
			return 1;
		}
		else if (a.weight < b.weight) {
			return -1;
		}
		else
			return 0;
			
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOrigin(String newOrigin) {
		this.origin = newOrigin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	
	public int getWeight() {
		return weight;
	}
}
