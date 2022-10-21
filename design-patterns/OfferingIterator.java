@SuppressWarnings(value="all")

public class OfferingIterator implements Listiterator {

	OfferingList offList;
	int i=-1;
	OfferingIterator(OfferingList ol){

		this.offList=ol;
	}
	public boolean HasNext() {

		if(i<this.offList.size()-1) return true;
		else{
			return false;
		}
	}



	public Object Next() {
		if(this.HasNext()){
			return this.offList.get(++i);
		}
		return null;
	}

	public void MoveToHead() {
		System.out.println("Head Moved!!");
	}

	public void Remove() {
	}



}
