package ShoesExample;

import java.util.TreeSet;

public class SortShoes {

	public static void main(String[] args) {
		Shoes s1 = new Shoes(1999.9,"Nike");
		Shoes s2 = new Shoes(3999.9,"Adidas");
		Shoes s3 = new Shoes(2999.9,"Decathlon");
		
		TreeSet<Shoes> t = new TreeSet<Shoes>();
		
		t.add(s1);
		t.add(s2);
		t.add(s3);

		for(Shoes s : t) {
			System.out.println(s);
		}

	}
}
