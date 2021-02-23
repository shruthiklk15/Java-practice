package ShoesExample;

public class Shoes implements Comparable<Shoes> {
	double cost;
	String name;
	
	Shoes(double cost,String name){
		this.cost=cost;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name+ " cost is " +cost;
	}
	
	public int compareTo(Shoes s) {
		return (int) (this.cost-s.cost);
	}

}
