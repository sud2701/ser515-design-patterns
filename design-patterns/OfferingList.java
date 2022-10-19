import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList extends ArrayList {

	private Offering[] offering;

	private Trading trading;

	ArrayList<Offering> off;

	OfferingList(){
		off=new ArrayList<>();
	}

	public Iterator createIterator(){
		return this.off.iterator();
	}

}
