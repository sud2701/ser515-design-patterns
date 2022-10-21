import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings(value="all")
public class Facade {

	Trading t;

	OfferingList ol;
	private TradingMenu tm;

	private OfferingMenu om;

	private UserInfoItem userInfoItem;

	private int UserType;

	Product selectedProduct;

	private int nProdCategory;

	ProductList prodList;

	private Person person;

	ArrayList<Trading> trlist=new ArrayList<>();

	Facade() throws IOException {

		Scanner x = new Scanner(System.in);
		System.out.println("Facade Pattern Started: ");
	}

	public void startFacade() throws IOException {
		System.out.println("Start Facade Method called!!");
		login();
		createProductList();

		productOperation();
		AttachProductToUser();
		System.out.println("Done Attaching");
		selectedProduct=SelectProduct();
		String t;
		if(selectedProduct.getType()==0){
			t="Meat";
		}
		else{
			t="Produce";
		}
		System.out.println("The selected Product : ");
		System.out.println(t+" : "+selectedProduct.getName());

		remind();
		System.out.println("These are the trades: ");
		OfferingIterator oi;
		oi = new OfferingIterator(ol);
		int x=0;
		while(oi.HasNext()){
			System.out.println(userInfoItem.getUsername()+" has a trade for "+(String)oi.Next());
		}
		System.out.println("This is the End of the Program. ");

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
		ol=new OfferingList();
		String tol;
		System.out.println("Attaching Prod to user");
		BufferedReader br=new BufferedReader(new FileReader("UserProduct.txt"));
		String userproduct;
		Product p;
		int counter=1;
		while((userproduct=br.readLine())!=null){
			String[] words=userproduct.split(":");
			if(words[0].equals(userInfoItem.getUsername())){

				for(int i=0;i<this.prodList.size();i++) {
					p = (Product) this.prodList.get(i);
					if (p.getName().equals(words[1])) {
						person.prodList.add(p);
						if(p.getType()==0){
							tol="Meat";
						}
						else{
							tol="Produce";
						}
						ol.add(tol);
						break;
					}
				}
			}
		}
		this.t=new Trading(ol);
		for(int i=0;i<prodList.size();i++){
			Product q=(Product)prodList.get(i);
			q.setTrading(t);
		}
		}

	public Product SelectProduct() {
		System.out.println("*******************Implementation of Iterator Pattern**********************");
		System.out.println("Select Product Method Called!!");
		System.out.println("These are the available products: ");

		ProductIterator pi=new ProductIterator(this.prodList);
		int pos=0;
		while(pos<5){
			Product p=(Product)pi.Next();
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
		Product sp=(Product)prodList.get(ch);
		return sp;
	}

	public void display(){
		System.out.println("Select Product Method Called!!");
		System.out.println("These are the available products: ");

		ProductIterator pi=new ProductIterator(this.prodList);
		int pos=0;
		while(pos<5){
			Product p=(Product)pi.Next();
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
		ReminderVisitor r = new ReminderVisitor();
		r.visitFacade(this);
	}



}
