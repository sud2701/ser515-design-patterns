import java.util.Scanner;
@SuppressWarnings(value="unused")
public class Buyer extends Person {

	Buyer() {
		super(theProductMenu);
	}

	public void showMenu() {

		System.out.println("Buyer Menu Items: ");
		int type=super.userinfo.getUsertype();
		if(theProductMenu.getClass()==new MeatProductMenu().getClass()){
			System.out.println("Meat Product Menu : ");
		}
		else if(theProductMenu.getClass()==new ProduceProductMenu().getClass()){
			System.out.println("Produce Product Menu : ");
		}
	}

	public void CreateProductMenu() {

		if(productType==0){
			theProductMenu=new MeatProductMenu();
		}
		else if(productType==1){
			theProductMenu=new ProduceProductMenu();
		}
	}

}
