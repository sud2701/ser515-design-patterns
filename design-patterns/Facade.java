import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings(value="unused")
public class Facade {

	private TradingMenu tm;

	private OfferingMenu om;

	private UserInfoItem userInfoItem;

	private int UserType;

	private Product selectedProduct;

	private int nProdCategory;

	private ProductList prodList;

	private Person person;

	Facade() throws IOException {
		Scanner x = new Scanner(System.in);
		System.out.println("Facade Pattern Started: ");
	}

	public void startFacade() throws IOException {
		System.out.println("Start Facade Method called!!");
		login();
		createProductList();
//		System.out.println("The product selected : ");
//		System.out.println(this.selectedProduct.getName());
//		System.out.println(":");
//		System.out.println(this.selectedProduct.getType()+"(Type)");
		productOperation();
		AttachProductToUser();
		SelectProduct();

	}
	public void login() throws IOException {
		Login loginObject=new Login();
		UserInfoItem temp=loginObject.login();
		if(temp==null){
			System.out.println("System Quitting...");
			System.exit(-1);
		}
		else{
			createUser(temp);
		}
	}

	public void createUser(UserInfoItem userInfoItem) {
		this.userInfoItem=userInfoItem;
		if(userInfoItem.getUsertype()==0){
			person=new Buyer();
		}
		else{
			person=new Seller();
		}
	}

	public void createProductList() throws IOException {
		prodList=new ProductList();
		System.out.println("Creating the Product List");
		prodList.getProductList();
	}

	public void AttachProductToUser() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("UserProduct.txt"));
		String userproduct=br.readLine();
		while(userproduct!=null){
			String[] words=userproduct.split(":");
			if(words[0].equals(userInfoItem.getUsername())){
				for(int i=0;i<prodList.size();i++){
					Product p=(Product)prodList.get(i);
					if(p.getName().equals(words[1])){
						person.prodList.addProduct(new Product(p.getType(),p.getName()));
						break;
					}
				}

			}
			userproduct=br.readLine();
		}

	}

	public Product SelectProduct() {

		System.out.println("Select Product Method Called!!");
		System.out.println("These are the available products: ");
		Iterator<Product> prit=(Iterator<Product>)prodList.createIterator();
		ProductIterator pi=new ProductIterator();
		int pos=1;
		while(pi.HasNext(prit)){
			Product p=prit.next();
			String t;
			if(p.getType()==0){
				t="Meat";
			}
			else{
				t="Produce";
			}
			System.out.println(pos+". ");
			System.out.println(p.getName()+":"+t+"(Type)");
			pos+=1;
		}
		System.out.println("Enter the number associated with your desired product: ");
		Scanner x=new Scanner(System.in);
		int ch=x.nextInt();
		selectedProduct=(Product)prodList.get(ch-1);
		return selectedProduct;
	}

	public void productOperation() {
		person.CreateProductMenu();
	}

	public void AddTrading() {
		tm.addTrading();
	}

	public void ViewTrading() {
		tm.viewTrading();
	}

	public void DecideBidding() {
		om.decideBidding();
	}

	public void DiscussBidding() {
		om.discussBidding();
	}

	public void SubmitBidding() {
		om.submitBidding();
	}

	public void markOffering(){

	}

	public void submitOffering(){

	}

	public void remind() {
		System.out.println("Reminder called!!");
		Reminder r = new Reminder();
		r.visitFacade(this);
	}



}
