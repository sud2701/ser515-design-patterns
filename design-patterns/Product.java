public class Product {

	private Trading trading;

	private ProductList productList;

	private int type;

	private String name;

	Product(int type, String name){
		this.type=type;
		this.name=name;
	}

	public void accept(NodeVisitor nv){
		System.out.println("Visiting the Product");
		nv.visitProduct(this);
	}

	public int getType(){
		return this.type;
	}

	public String getName(){
		return this.name;
	}

}
