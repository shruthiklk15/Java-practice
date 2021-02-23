package LaptopExample;

import java.util.TreeSet;

public class SortLaptops {

	public static void main(String[] args) {
		Laptops l1 = new Laptops(25000,"Acer");
		Laptops l2 = new Laptops(26000,"HP");
		Laptops l3 = new Laptops(27000,"Dell");
		
		TreeSet<Laptops> t = new TreeSet<Laptops>();
		
		t.add(l1);
		t.add(l2);
		t.add(l3);

		for(Laptops l : t) {
			System.out.println(l);
		}
	}
}
