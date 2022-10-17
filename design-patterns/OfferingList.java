import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList extends ArrayList {

	private Offering[] offering;

	private Trading trading;

	ArrayList<String> off=new ArrayList<>();

	OfferingList(){
		off.add("A");
		off.add("B");
		off.add("C");
		off.add("D");
	}

	public Iterator createIterator(){
		return this.off.iterator();
	}

}
