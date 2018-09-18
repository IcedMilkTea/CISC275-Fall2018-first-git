public class Dog extends Animal implements Comparable<Dog>{

	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	public String toString() {
		return name + ": " + legs;
	}
	
	public int compare(Animal a1,Animal a2){
		return a1.legs - a2.legs;
	}
	@Override
	public int compareTo(Dog arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
