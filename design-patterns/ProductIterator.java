@SuppressWarnings(value="all")
public class ProductIterator implements Listiterator {

	ProductList prodList;
	int index=-1;

	ProductIterator(ProductList prodList){
		this.prodList=prodList;
	}

	public boolean HasNext() {
		if(index < this.prodList.size()-1){
			return true;
		}else{
			return false;
		}

	}

	public Object Next() {
		if(this.HasNext()){
			return this.prodList.get(++index);
		}
		return null;
	}

	public void MoveToHead() {

		System.out.println("Moved Head");
	}


	public void Remove() {
	}
}
