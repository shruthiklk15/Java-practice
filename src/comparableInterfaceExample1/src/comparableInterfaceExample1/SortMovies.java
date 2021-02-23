package comparableInterfaceExample1;

import java.util.TreeSet;

public class SortMovies {
	public static void main(String[] args) {
		Movies m1 = new Movies(250,"KGF1");
		Movies m2 = new Movies(270,"KGF2");
		Movies m3 = new Movies(150,"KGu3");
		
		TreeSet<Movies> t = new TreeSet<Movies>();
		
		t.add(m1);
		t.add(m2);
		t.add(m3);
		
		for(Movies m : t) {
			System.out.println(m);
		}
	}

}
