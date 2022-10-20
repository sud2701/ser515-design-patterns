public class MeatProductMenu implements ProductMenu {

	MeatProductMenu(){
		showMenu();
	}

	public void showMenu() {
		System.out.println("1. Beef");
		System.out.println("2. Pork");
		System.out.println("3. Mutton");
	}

	public void showAddButton() {

		System.out.println("Meat Add Button");
	}

	public void showViewButton() {

		System.out.println("View Meat Options Button");
	}


	public void showRadioButton() {

		System.out.println("View Meat Type Button");
	}

	public void showLabels() {

		System.out.println("Meat Labels Button");
	}

	public void showComboxes() {

		System.out.println("Meat Comboxes Button");
	}

}
