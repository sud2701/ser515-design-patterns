@SuppressWarnings(value="unused")
public class Product {

	public Trading trading;

	private ProductList productList;

	private final int type;

	private final String name;


	Product(int type, String name){
		this.type=type;
		this.name=name;
	}

	public void accept(NodeVisitor nv){
		System.out.println("Accept Method in Product");
		nv.visitProduct(this);
	}

	public int getType(){

		return this.type;
	}

	public String getName(){

		return this.name;
	}

	public void setTrading(Trading t){
		this.trading=t;
	}

}
