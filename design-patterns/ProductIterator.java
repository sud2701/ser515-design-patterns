import java.util.Iterator;
import java.util.ListIterator;

public class ProductIterator implements ListIterator {

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
	public boolean HasNext(Iterator it) {

		return it.hasNext();
	}

	public Product Next(Iterator it) {
		if(this.HasNext(it)){
			return (Product)it.next();
		}
		else{
			return null;
		}
	}

	public void MoveToHead() {

		System.out.println("Moved Head");
	}

	public void Remove(Iterator it) {
		if(this.HasNext(it)){
			it.remove();
		}
	}
}
