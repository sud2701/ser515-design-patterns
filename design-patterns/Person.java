public abstract class Person {

	protected static ProductMenu productMenu;

	protected UserInfoItem userinfo;

	protected static int productType;

	ProductList prodList;

	public Person(){


	}
	public void showAddButton() {
		productMenu.showAddButton();
	}

	public void showViewButton() {
		productMenu.showViewButton();
	}

	public void showRadioButton() {
		productMenu.showRadioButton();
	}

	public void showLabels() {
		productMenu.showLabels();
	}

	public void addProduct(Product product){
		prodList.addProduct(product);
	}

	public abstract void showMenu();

	public abstract void CreateProductMenu();

}
