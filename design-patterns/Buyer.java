import java.util.Scanner;
@SuppressWarnings(value="unused")
public class Buyer extends Person {

	Buyer() {

	}

	public void showMenu() {

		System.out.println("Buyer Menu Items: ");
		int type=super.userinfo.getUsertype();
		productMenu.display();
	}

	public void CreateProductMenu() {

		System.out.println("What type of Product do you want [0:Meat/1:Produce]?");
		Scanner x=new Scanner(System.in);
		int ch=x.nextInt();

		if(ch==0){
			productMenu=new MeatProductMenu();
			productType=0;
		}
		else if(ch==1){
			productMenu=new ProduceProductMenu();
			productType=1;
		}
	}

}
