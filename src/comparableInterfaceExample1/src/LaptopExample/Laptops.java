package LaptopExample;

public class Laptops implements Comparable<Laptops>{
	int cost;
	String brand;
	
	Laptops(int cost,String brand){
		this.cost=cost;
		this.brand=brand;
	}
	
	public String toString() {
		return "Laptop Brand: " +brand+" Cost: "+cost;
	}
	
	@Override
	public int compareTo(Laptops l) {
		return this.cost-l.cost;
	}
	
}