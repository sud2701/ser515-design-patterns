import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ProductList theProductList;

	private Person thePerson;

	Facade(){
		System.out.println("Facade Pattern Started: ");
	}

	public void startFacade() throws IOException {
		System.out.println("Start Facade Method called!!");
	}
	public int login(Login lg) throws IOException {

		return lg.login();
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {
	}

	public void createUser(UserInfoItem userInfoItem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct(ProductMenu productMenu, int userType) {

	}

	public void productOperation() {

	}

}
