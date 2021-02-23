package comparableInterfaceExample1;

public class Movies implements Comparable<Movies> {
	int ticketCost;
	String movieName;
	
	Movies(int ticketCost, String movieName){
		this.movieName = movieName;
		this.ticketCost = ticketCost;
	}
	
	@Override
	public String toString() {
		return " Movie name: "+movieName+" cost is "+ticketCost;
	}
	
	@Override
	public int compareTo(Movies m) {
		return this.movieName.compareTo(m.movieName);
	}

}
