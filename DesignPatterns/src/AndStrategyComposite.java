import java.util.Vector;
import java.util.Iterator;

class AndStrategyComposite implements CheckStrategy {

	private java.util.Vector<CheckStrategy> tests = new Vector<CheckStrategy>();

	public void addStrategy(CheckStrategy s) { 
		tests.addElement(s); 
	}

	public boolean check(String s) {	

		Iterator<CheckStrategy> e = tests.iterator();
		while (e.hasNext()) {	
			CheckStrategy strategy = e.next();
			if ( !strategy.check(s) ) {
				return false;
			}
		}
		return true;
	}
}
