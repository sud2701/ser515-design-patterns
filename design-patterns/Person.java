@SuppressWarnings(value="unused")

public abstract class Person {

	protected static ProductMenu productMenu;

	protected UserInfoItem userinfo;

	protected static int productType;

	ProductList prodList;

	public Person(){
		prodList=new ProductList();

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


	public abstract void showMenu();

	public abstract void CreateProductMenu();

}
