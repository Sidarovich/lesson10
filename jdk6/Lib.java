package epm.com.jdk6;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Lib {
	private List<PrintedEdition> units = new ArrayList<PrintedEdition>();
	
	public Lib() {}
	
	public void add(PrintedEdition unit) {
		units.add(unit);
	}
	
	public void remove(PrintedEdition unit) {
		units.remove(unit);
	}
	
	public List<PrintedEdition> find(find findMatcher){//FindByTitle
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}

	public void add(Book book) {
		// TODO Auto-generated method stub
		
	}
}
