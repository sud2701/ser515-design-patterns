import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings(value="unused")
public class Facade {

	private final Scanner x = new Scanner(System.in);

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ProductList theProductList;

	private Person thePerson;

	private TradingMenu tradingMenu;

	private OfferingMenu offeringMenu;

	private UserInfoItem userInfoItem;

	Facade() throws IOException {

		System.out.println("Facade Pattern Started: ");
		startFacade();
	}

	public void startFacade() throws IOException {
		System.out.println("Start Facade Method called!!");
		Login loginObject=new Login();
		if(!login(loginObject)){
			System.out.println("System Exitting...");
			System.exit(-1);
		}
		createProductList();
		System.out.println("The product selected : ");
		System.out.println(this.theSelectedProduct.getName()+":"+this.theSelectedProduct.getType()+"(Type)");
		AttachProductToUser();
		productOperation();
	}
	public boolean login(Login lg) throws IOException {
		return lg.login();
	}

	public void addTrading() {
		tradingMenu.addTrading();
	}

	public void viewTrading() {
		tradingMenu.viewTrading();
	}

	public void decideBidding() {
		offeringMenu.decideBidding();
	}

	public void discussBidding() {
		offeringMenu.discussBidding();
	}

	public void submitBidding() {
		offeringMenu.submitBidding();
	}

	public void remind() {
		Reminder reminder = new Reminder();
		reminder.visitFacade(this);
	}

	public void createUser(UserInfoItem userInfoItem) {
		this.userInfoItem=userInfoItem;
		this.UserType=userInfoItem.getUsertype();
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
