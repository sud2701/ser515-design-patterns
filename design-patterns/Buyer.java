import java.util.Scanner;

public class Buyer extends Person {

	Buyer(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	public void showMenu() {
		System.out.println("Buyer Menu Items: ");
	}

	public ProductMenu CreateProductMenu() {
		System.out.println("Here are your choices:");
		System.out.println("1. Meat Product Menu");
		System.out.println("2. Produce Product Menu");
		System.out.print("Please enter your choice: ");

		Scanner x=new Scanner(System.in);
		int ch=x.nextInt();
		switch(ch){
			case 1: return new MeatProductMenu();
			case 2: return new ProduceProductMenu();
			default: System.out.println("Invalid Choice");
			System.exit(-1);
		}
		return null;
	}

}
