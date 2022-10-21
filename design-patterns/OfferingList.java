import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
