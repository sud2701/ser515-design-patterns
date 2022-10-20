public abstract class Person {

	protected static ProductMenu theProductMenu;

	protected UserInfoItem userinfo;

	protected static int productType;

	public Person(ProductMenu theProductMenu){

		this.theProductMenu=theProductMenu;
	}

	public abstract void showMenu();

	public void showAddButton() {
		theProductMenu.showAddButton();
	}

	public void showViewButton() {
		theProductMenu.showViewButton();
	}

	public void showRadioButton() {
		theProductMenu.showRadioButton();
	}

	public void showLabels() {
		theProductMenu.showLabels();
	}

	public abstract void CreateProductMenu();

}
