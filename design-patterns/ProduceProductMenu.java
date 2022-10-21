public class ProduceProductMenu implements ProductMenu {

	ProduceProductMenu(){
		System.out.println("*******************Implementation of Factory Pattern****************");
		System.out.println("Produce Product Menu");
		display();
	}

	public void showAddButton() {

		System.out.println("Add Produce Button");
	}

	public void showViewButton() {

		System.out.println("View Produce Button");
	}

	public void showRadioButton() {

		System.out.println("View Produce Type Button");
	}

	public void showLabels() {

		System.out.println("Produce Labels Button");
	}

	public void showComboxes() {

		System.out.println("Produce Comboxes Button");
	}
	public void showMenu() {
		System.out.println("1. Tomato");
		System.out.println("2. Onion");
	}

	public void display(){
		showMenu();
		showAddButton();
		showViewButton();
		showRadioButton();
		showLabels();
		showComboxes();
	}

}
