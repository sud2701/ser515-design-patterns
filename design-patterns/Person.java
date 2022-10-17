public abstract class Person {

	private ProductMenu theProductMenu;

	Person(ProductMenu theProductMenu){
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

	public abstract ProductMenu CreateProductMenu();

}
