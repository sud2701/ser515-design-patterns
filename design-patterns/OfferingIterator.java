import java.util.Iterator;
import java.util.ListIterator;

public class OfferingIterator implements ListIterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	@Override
	public Object previous() {
		return null;
	}

	@Override
	public int nextIndex() {
		return 0;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {

	}

	@Override
	public void set(Object o) {

	}

	@Override
	public void add(Object o) {

	}
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}



	public Product Next(Iterator iterator) {
		if(this.HasNext(iterator)){
			return (Product)iterator.next();
		}
		else{
			return null;
		}
	}

	public void MoveToHead() {
		System.out.println("Head Moved!!");
	}

	public void Remove(Iterator it) {
		it.remove();
	}



}
